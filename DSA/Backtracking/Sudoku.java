public class Sudoku {

    // Print the Sudoku board
    public static void printBoard(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }


    // Check whether placing digit is safe
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {

        // Check row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Find starting row and column of 3x3 box
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        // Check 3x3 box
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    // Solve Sudoku using Backtracking
    public static boolean sudokuSolver(int sudoku[][], int row, int col) {

        // If all rows are completed
        if (row == 9) {
            return true;
        }

        // Move to next row after completing current row
        int nextRow = row;
        int nextCol = col + 1;

        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // If current cell is already filled
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // Try digits 1 to 9
        for (int digit = 1; digit <= 9; digit++) {

            if (isSafe(sudoku, row, col, digit)) {

                // Choose
                sudoku[row][col] = digit;

                // Explore
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }

                // Undo / Backtrack
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    public static void main(String args[]) {

        int sudoku[][] = {
            {0, 0, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},

            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},

            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists:");
            printBoard(sudoku);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
