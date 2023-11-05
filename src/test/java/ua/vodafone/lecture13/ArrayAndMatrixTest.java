package ua.vodafone.lecture13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ua.vodafone.lecture13.ArrayAndMatrix.calculateArrayArithmeticAverage;
import static ua.vodafone.lecture13.ArrayAndMatrix.defineIfMatrixIsSquare;

public class ArrayAndMatrixTest {

    @Test
    public void arrayArithmeticAverageCalculation() {
        // given
        int[] array = {2, 3, 4, 5};

        // when
        double result = calculateArrayArithmeticAverage(array);

        // then
        Assertions.assertEquals(3.5, result, 0.001);
    }

    @Test
    public void arrayIsNull() {
        // given
        int[] array = null;

        // when
        double result = calculateArrayArithmeticAverage(array);

        // then
        Assertions.assertEquals(-1, result, 0.001);
    }

    @Test
    public void arrayIsEmpty() {
        // given
        int[] array = {};

        // when
        double result = calculateArrayArithmeticAverage(array);

        // then
        Assertions.assertEquals(-1, result, 0.001);
    }

    @Test
    public void matrixIsSquare() {
        // given
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // when
        boolean result = defineIfMatrixIsSquare(matrix);

        // then
        Assertions.assertTrue(result);
    }

    @Test
    public void matrixIsNotSquare() {
        // given
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
        };

        // when
        boolean result = defineIfMatrixIsSquare(matrix);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    public void matrixIsStepArray() {
        // given
        int[][] matrix = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8},
                {9}
        };

        // when
        boolean result = defineIfMatrixIsSquare(matrix);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    public void matrixIsEmpty() {
        // given
        int[][] matrix = {};

        // when
        boolean result = defineIfMatrixIsSquare(matrix);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    public void matrixWithEmptyRows() {
        // given
        int[][] matrix = {{}, {}, {}};

        // when
        boolean result = defineIfMatrixIsSquare(matrix);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    public void matrixWithNullRow() {
        // given
        int[][] matrix = {
                null,
                {1, 2, 3},
                {4, 5, 6}
        };

        // when
        boolean result = defineIfMatrixIsSquare(matrix);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    public void matrixIsNull() {
        // given
        int[][] matrix = null;

        // when
        boolean result = defineIfMatrixIsSquare(matrix);

        // then
        Assertions.assertFalse(result);
    }
}
