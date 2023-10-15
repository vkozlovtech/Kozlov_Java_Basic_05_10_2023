package ua.vodafone.lecture07.homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MatricesTransposition {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter matrix size:\n" + "Rows (M) = ");
        int row = SCANNER.nextInt();
        System.out.print("Columns (N) = ");
        int column = SCANNER.nextInt();

        int[][] matrix = generateMatrixElements(row, column);

        System.out.println("\nOriginal matrix (M x N):\n");
        displayMatrix(matrix);

        System.out.println("\nTransposed matrix (N x M):\n");
        displayMatrix(transposeOriginalMatrix(matrix));
    }

    private static int[][] transposeOriginalMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    private static int[][] generateMatrixElements(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(100);
            }
        }
        return matrix;
    }
}
