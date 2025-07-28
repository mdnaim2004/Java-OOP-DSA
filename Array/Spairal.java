public class Spairal {

    public static void spairal(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right column (startRow+1 to skip duplicate)
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom row
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) break;  // avoid duplicate
                System.out.print(matrix[endRow][j] + " ");
            }

            // left column
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) break;  // avoid duplicate
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        spairal(matrix);
    }
}
