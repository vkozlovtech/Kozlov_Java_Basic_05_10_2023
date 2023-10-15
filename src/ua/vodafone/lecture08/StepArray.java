package ua.vodafone.lecture08;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StepArray {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Let's create a matrix with rows of different lengths using the following parameters:" +
                "\nRow quantity = ");
        int row = SCANNER.nextInt();
        System.out.print("The maximum number of elements in a row = ");
        int maxColumns = SCANNER.nextInt();
        int[][] matrix = fillMatrix(row, maxColumns);

        System.out.println("\nOriginal matrix:\n");
        displayMatrix(matrix);

        System.out.println("\nMatrix when the odd rows are sorted by descending, and the even rows by ascending:\n");
        sortMatrix(matrix);
        displayMatrix(matrix);

        System.out.println("\nThe sum of all matrix elements: " + displaySum(matrix));

        int[] minElements = fillArray(matrix);
        System.out.print("The minimum elements for each row of the matrix: ");
        displayArray(minElements);

        int absoluteMin = findMin(minElements);
        System.out.print("\nThe absolute minimum of the matrix: ");
        displayAbsoluteMin(absoluteMin);

        System.out.println("\n\nLet's try to divide each element of the matrix by the absolute minimum:\n");
        displayDivisionResult(matrix, absoluteMin);
    }

    private static void displayDivisionResult(int[][] matrix, int absoluteMin) {
        if (absoluteMin == 0) {
            System.out.println("[error] Absolute minimum = 0, division is not possible!");
        } else if (absoluteMin == -1) {
            System.out.println("[error] Absolute minimum = NULL, division is not possible!");
        } else {
            divideMatrix(matrix, absoluteMin);
            displayMatrix(matrix);
        }
    }

    private static void divideMatrix(int[][] matrix, int absoluteMin) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] /= absoluteMin;
            }
        }
    }

    private static void displayAbsoluteMin(int absoluteMin) {
        if (absoluteMin == -1) {
            System.out.print("NULL");
        } else {
            System.out.print(absoluteMin);
        }
    }

    private static void displayArray(int[] minElements) {
        System.out.print("[ ");
        for (int element : minElements) {
            if (element == -1) {
                System.out.print("NULL ");
            } else {
                System.out.print(element + " ");
            }
        }
        System.out.print("]");
    }

    private static int[] fillArray(int[][] matrix) {
        int[] minElements = new int[matrix.length];
        for (int i = 0; i < minElements.length; i++) {
            if (matrix[i].length != 0) {
                minElements[i] = findMin(matrix[i]);
            } else {
                minElements[i] = -1;
            }
        }
        return minElements;
    }

    private static int findMin(int[] row) {
        int min = row[0];
        for (int rowElement : row) {
            if (min > rowElement) {
                min = rowElement;
            }
        }
        return min;
    }

    private static int displaySum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int column : row) {
                sum += column;
            }
        }
        return sum;
    }

    private static void sortMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if ((i + 1) % 2 == 0) {
                sortAscending(matrix[i]);
            } else {
                sortDescending(matrix[i]);
            }
        }
    }

    private static void sortAscending(int[] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                if (matrix[j] > matrix[j + 1]) {
                    swap(matrix, j);
                }
            }
        }
    }

    private static void sortDescending(int[] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                if (matrix[j] < matrix[j + 1]) {
                    swap(matrix, j);
                }
            }
        }
    }

    private static void swap(int[] matrix, int j) {
        int tmp = matrix[j];
        matrix[j] = matrix[j + 1];
        matrix[j + 1] = tmp;
    }

    private static int[][] fillMatrix(int row, int maxColumns) {
        int[][] matrix = new int[row][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[ThreadLocalRandom.current().nextInt(maxColumns)];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(10);
            }
        }
        return matrix;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("[ ");
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println("]");
        }
    }
}
