package ua.vodafone.lecture13;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayAndMatrix {
    public static void main(String[] args) {

        int[] array = generateArray();
        System.out.println("Array:");
        displayArray(array);
        System.out.println("Average arithmetic value of array = " + calculateArrayArithmeticAverage(array) + '\n');

        int[][] matrix = generateMatrix();
        System.out.println("Matrix:");
        displayMatrix(matrix);
        System.out.println("Matrix is square = " + defineIfMatrixIsSquare(matrix));
    }

    public static boolean defineIfMatrixIsSquare(int[][] matrix) {
        if (matrix == null) {
            return false;
        } else if (matrix.length == 0) {
            return false;
        }
        for (int[] row : matrix) {
            if (row == null || row.length != matrix.length) {
                return false;
            }
        }
        return true;
    }

    private static void displayMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            System.out.println("[ IS EMPTY ]");
        }
        for (int[] row : matrix) {
            System.out.print("[ ");
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println("]");
        }
    }

    private static int[][] generateMatrix() {
        int[][] matrix =
                new int[ThreadLocalRandom.current().nextInt(6)][ThreadLocalRandom.current().nextInt(6)];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(10);
            }
        }
        return matrix;
    }

    public static double calculateArrayArithmeticAverage(int[] array) {
        if (array == null) {
            return -1;
        } else if (array.length == 0) {
            return -1;
        }
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    private static void displayArray(int[] array) {
        if (array.length == 0) {
            System.out.println("[ IS EMPTY ]");
        } else {
            System.out.print("[ ");
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println("]");
        }
    }

    private static int[] generateArray() {
        int[] array = new int[ThreadLocalRandom.current().nextInt(6)];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(10);
        }
        return array;
    }
}
