package kyu5;

/**
 * 5 kyu - Square Matrix Multiplication
 *
 * https://www.codewars.com/kata/5263a84ffcadb968b6000513/java
 *
 * DESCRIPTION:
 * Write a function that accepts two square (NxN) matrices (two dimensional arrays), and returns the product of the two. Only square matrices will be given.
 *
 * How to multiply two square matrices:
 *
 * We are given two matrices, A and B, of size 2x2 (note: tests are not limited to 2x2). Matrix C, the solution, will be equal to the product of A and B.
 * To fill in cell [0][0] of matrix C, you need to compute: A[0][0] * B[0][0] + A[0][1] * B[1][0].
 *
 * More general: To fill in cell [n][m] of matrix C, you need to first multiply the elements in the nth row of matrix A by the elements in the mth column of matrix B, then take the sum of all those products.
 * This will give you the value for cell [m][n] in matrix C.
 *
 */

public class MatrixMultiplication {
    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int n = a.length;
        int[][] c = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int g = 0; g < n; g++) {
                    c[i][j] += a[i][g] * b[g][j];
                }
            }
        }
        return c;
    }

}
