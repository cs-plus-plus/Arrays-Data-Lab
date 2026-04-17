package csplusplus.arrays;

/**
 * CS++ Arrays & Data Lab — GridUtils
 *
 * Static operations on 2D integer grids (think grayscale pixel data, 0..255).
 * Implement each method. Unless noted, methods return a NEW grid and must not
 * mutate the argument.
 *
 * CED: 4.2, 4.3, 4.4, 4.5, 4.11, 4.12, 4.13
 */
public final class GridUtils {

    private GridUtils() { /* utility class */ }

    /**
     * Return {row, col} for the first occurrence of target (row-major scan),
     * or {-1, -1} if not found.
     */
    public static int[] findValue(int[][] grid, int target) {
        throw new UnsupportedOperationException("findValue not implemented");
    }

    /**
     * In-place: replace every occurrence of oldVal with newVal in the grid.
     */
    public static void replaceAll(int[][] grid, int oldVal, int newVal) {
        throw new UnsupportedOperationException("replaceAll not implemented");
    }

    /**
     * Return a new grid that mirrors the input horizontally
     * (each row reversed; rows stay in order).
     */
    public static int[][] mirrorHorizontal(int[][] grid) {
        throw new UnsupportedOperationException("mirrorHorizontal not implemented");
    }

    /**
     * Return a new grid that mirrors the input vertically
     * (rows reversed; within each row, columns stay in order).
     */
    public static int[][] mirrorVertical(int[][] grid) {
        throw new UnsupportedOperationException("mirrorVertical not implemented");
    }

    /**
     * Return a new grid rotated 90 degrees clockwise.
     * For an R×C input, the output is C×R.
     */
    public static int[][] rotate90CW(int[][] grid) {
        throw new UnsupportedOperationException("rotate90CW not implemented");
    }

    /**
     * Photo-negative. Return a new grid where each pixel is (max - pixel).
     * Assume pixel values are clamped to [0, max].
     */
    public static int[][] invert(int[][] grid, int max) {
        throw new UnsupportedOperationException("invert not implemented");
    }

    /**
     * Binary threshold. Return a new grid where each pixel is:
     *   - 0 if original value < threshold
     *   - 1 otherwise
     */
    public static int[][] threshold(int[][] grid, int threshold) {
        throw new UnsupportedOperationException("threshold not implemented");
    }

    /**
     * Return the mean of every cell in the grid as a double.
     * Assume the grid has at least one cell.
     */
    public static double average(int[][] grid) {
        throw new UnsupportedOperationException("average not implemented");
    }

    /**
     * Count how many cells equal the target value.
     */
    public static int countOccurrences(int[][] grid, int target) {
        throw new UnsupportedOperationException("countOccurrences not implemented");
    }

    /**
     * 3×3 box blur. For each cell, return the rounded-down integer mean
     * of the 3×3 neighborhood centered on that cell. On the border where
     * the neighborhood extends outside the grid, average ONLY the cells
     * that are in bounds (so corners average a 2×2 region).
     * Returns a new grid with the same dimensions.
     */
    public static int[][] blur3x3(int[][] grid) {
        throw new UnsupportedOperationException("blur3x3 not implemented");
    }
}
