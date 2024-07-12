import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix A
        System.out.print("Enter the number of rows for matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix A: ");
        int colsA = scanner.nextInt();
        int[][] matrixA = inputMatrix(rowsA, colsA, "A", scanner);

        // Input matrix B
        System.out.print("Enter the number of rows for matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix B: ");
        int colsB = scanner.nextInt();
        int[][] matrixB = inputMatrix(rowsB, colsB, "B", scanner);

        // Perform matrix multiplication
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        // Display the result
        System.out.println("\nResultant Matrix (A * B):");
        displayMatrix(resultMatrix);

        // Close the scanner
        scanner.close();
    }

    // Method to input a matrix from the user
    private static int[][] inputMatrix(int rows, int cols, String matrixName, Scanner scanner) {
        System.out.println("Enter elements for matrix " + matrixName + ":");
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to perform matrix multiplication
    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        // Check if multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. Columns of matrix A must be equal to rows of matrix B.");
            System.exit(1); // Terminate the program
        }

        // Initialize the result matrix
        int[][] resultMatrix = new int[rowsA][colsB];

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return resultMatrix;
    }

    // Method to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Output:
// Enter the number of rows for matrix A: 2
// Enter the number of columns for matrix A: 2
// Enter the elements of matrix A:
// Enter element at position(1,1): 3
// Enter element at position(1,2): 3
// Enter element at position(2,1): 5
// Enter element at position(2,2): 6
// Enter the number of rows for matrix B: 2
// Enter the number of columns for matrix B: 2
// Enter the elements of matrix B:
// Enter element at position(1,1): 7
// Enter element at position(1,2): 8
// Enter element at position(2,1): 1
// Enter element at position(2,2): 2

// Result Matrix(A*B):
// 24 30 
// 41 52 