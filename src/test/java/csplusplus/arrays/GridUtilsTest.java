package csplusplus.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GridUtilsTest {

    private int[][] sample() {
        return new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    }

    @Test
    void findValue_hit() {
        assertArrayEquals(new int[]{1, 1}, GridUtils.findValue(sample(), 5));
    }

    @Test
    void findValue_miss() {
        assertArrayEquals(new int[]{-1, -1}, GridUtils.findValue(sample(), 99));
    }

    @Test
    void replaceAll_inPlace() {
        int[][] g = {{1, 2, 1}, {1, 3, 1}};
        GridUtils.replaceAll(g, 1, 9);
        assertArrayEquals(new int[]{9, 2, 9}, g[0]);
        assertArrayEquals(new int[]{9, 3, 9}, g[1]);
    }

    @Test
    void mirrorHorizontal_basic() {
        int[][] out = GridUtils.mirrorHorizontal(sample());
        assertArrayEquals(new int[]{3, 2, 1}, out[0]);
        assertArrayEquals(new int[]{6, 5, 4}, out[1]);
        assertArrayEquals(new int[]{9, 8, 7}, out[2]);
    }

    @Test
    void mirrorHorizontal_doesNotMutateInput() {
        int[][] g = sample();
        GridUtils.mirrorHorizontal(g);
        assertArrayEquals(new int[]{1, 2, 3}, g[0]);
    }

    @Test
    void mirrorVertical_basic() {
        int[][] out = GridUtils.mirrorVertical(sample());
        assertArrayEquals(new int[]{7, 8, 9}, out[0]);
        assertArrayEquals(new int[]{4, 5, 6}, out[1]);
        assertArrayEquals(new int[]{1, 2, 3}, out[2]);
    }

    @Test
    void rotate90CW_square() {
        int[][] out = GridUtils.rotate90CW(sample());
        assertArrayEquals(new int[]{7, 4, 1}, out[0]);
        assertArrayEquals(new int[]{8, 5, 2}, out[1]);
        assertArrayEquals(new int[]{9, 6, 3}, out[2]);
    }

    @Test
    void rotate90CW_rectangular() {
        int[][] in = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };
        int[][] out = GridUtils.rotate90CW(in);
        // 2×4 becomes 4×2
        assertEquals(4, out.length);
        assertEquals(2, out[0].length);
        assertArrayEquals(new int[]{5, 1}, out[0]);
        assertArrayEquals(new int[]{6, 2}, out[1]);
        assertArrayEquals(new int[]{7, 3}, out[2]);
        assertArrayEquals(new int[]{8, 4}, out[3]);
    }

    @Test
    void invert_basic() {
        int[][] in = {{0, 100, 255}};
        int[][] out = GridUtils.invert(in, 255);
        assertArrayEquals(new int[]{255, 155, 0}, out[0]);
    }

    @Test
    void threshold_basic() {
        int[][] in = {{10, 50, 128, 200}};
        int[][] out = GridUtils.threshold(in, 100);
        assertArrayEquals(new int[]{0, 0, 1, 1}, out[0]);
    }

    @Test
    void average_basic() {
        assertEquals(5.0, GridUtils.average(sample()), 1e-9);
    }

    @Test
    void countOccurrences_basic() {
        int[][] g = {{1, 2, 1}, {1, 3, 1}};
        assertEquals(4, GridUtils.countOccurrences(g, 1));
        assertEquals(1, GridUtils.countOccurrences(g, 3));
        assertEquals(0, GridUtils.countOccurrences(g, 99));
    }

    @Test
    void blur3x3_uniformUnchanged() {
        int[][] uniform = {
            {5, 5, 5},
            {5, 5, 5},
            {5, 5, 5}
        };
        int[][] out = GridUtils.blur3x3(uniform);
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                assertEquals(5, out[r][c]);
    }

    @Test
    void blur3x3_centerAveragesAllNine() {
        int[][] g = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] out = GridUtils.blur3x3(g);
        assertEquals(5, out[1][1]); // (1+2+3+4+5+6+7+8+9)/9 = 45/9 = 5
    }
}
