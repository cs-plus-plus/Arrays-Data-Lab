# CS++ Arrays & Data Lab

**Replaces:** College Board's retired *Picture Lab*
**Curriculum days:** 41–44 (AP CSA — CS++ 90-day plan)
**CED topics:** 4.1, 4.2, 4.3, 4.4, 4.5, 4.11, 4.12, 4.13

A 4-day lab applying 1D and 2D array traversals to grid/pixel-like data. You implement a utility class `GridUtils` that finds, transforms, and analyzes 2D integer grids (think grayscale pixels, 0–255). Uses the same pedagogical moves as the old Picture Lab without the AWT image dependency.

---

## Day 1 — Traversals & Find/Replace

**Objectives**
- Apply 1D and 2D array traversals to a pixel/grid dataset.
- Implement at least 2 traversal algorithms (`findValue`, `replaceAll`).
- Pass the CS++ Maven tests for core operations.

**Procedure (90 min)**
1. Lab overview (10 min)
2. Explore the data model — row-major vs. column-major (10 min)
3. Build sprint — implement `findValue`, `replaceAll`, `countOccurrences`, `average` (55 min)
4. Check & commit (15 min)

**Success criteria**
- You traverse the grid with both enhanced-for and standard `for`
- First 4 method tests pass

**Exit ticket:** Describe in one sentence how you "find" an element in the grid.

---

## Day 2 — Transforms

**Objectives**
- Implement transform operations: `mirrorHorizontal`, `mirrorVertical`, `rotate90CW`.
- Add unit tests for edge cases you care about.
- Pair-review a partner's solution.

**Procedure (90 min)**
1. Stand-up (5 min)
2. Transform sprint (55 min)
3. Add your own unit tests to `GridUtilsTest` (15 min)
4. Pair review (15 min)

**Success criteria**
- At least 2 transform methods passing
- Partner feedback documented in `REFLECTION.md`

**Exit ticket:** What was the trickiest edge case today?

---

## Day 3 — Algorithms on Pixel Data

**Objectives**
- Implement `invert`, `threshold`, and `blur3x3`.
- Apply nested loops correctly.
- Informally compare runtime between `invert` and `blur3x3`.

**Procedure (90 min)**
1. Stand-up (5 min)
2. Focused build (55 min)
3. Informal benchmark — how many millis for a 500×500 grid? (15 min)
4. Reflect in `REFLECTION.md` (15 min)

**Success criteria**
- Algorithm tests pass (all of `invert`, `threshold`, `blur3x3`)
- You can explain Big-O in plain English (O(n²) for blur because of the neighborhood; O(n) per cell because the 3×3 window is constant)

**Exit ticket:** Is `invert` O(n) or O(n²)? Why?

---

## Day 4 — Wrap-up

**Objectives**
- Submit final lab with all tests green.
- Document design choices in `REFLECTION.md`.
- Connect lab concepts to upcoming midterm FRQs.

**Procedure (90 min)**
1. Stand-up (5 min)
2. Finalize & polish (40 min)
3. Write README & reflection (20 min)
4. Submit + demo (25 min)

**Success criteria**
- Full submission with README and passing tests

**Exit ticket:** Which FRQ style does this lab best prepare you for?

---

## What to implement

Open `src/main/java/csplusplus/arrays/GridUtils.java` and implement each static method:

| Method | Signature | Notes |
|---|---|---|
| `findValue` | `(int[][], int) → int[]` | row-major scan, `{-1,-1}` if not found |
| `replaceAll` | `(int[][], int, int) → void` | mutates input in place |
| `mirrorHorizontal` | `(int[][]) → int[][]` | each row reversed; new grid |
| `mirrorVertical` | `(int[][]) → int[][]` | rows reversed; new grid |
| `rotate90CW` | `(int[][]) → int[][]` | R×C becomes C×R |
| `invert` | `(int[][], int) → int[][]` | `max - pixel` |
| `threshold` | `(int[][], int) → int[][]` | binary 0/1 |
| `average` | `(int[][]) → double` | mean of all cells |
| `countOccurrences` | `(int[][], int) → int` | |
| `blur3x3` | `(int[][]) → int[][]` | integer mean of 3×3 neighborhood; partial windows on borders |

## Workflow

```bash
mvn test                                         # all tests
mvn -Dtest=GridUtilsTest#blur3x3_centerAveragesAllNine test
```

Commit & push — the autograder runs `mvn -B -q test`.

## Requirements

- Java 17+
- Maven 3.8+
