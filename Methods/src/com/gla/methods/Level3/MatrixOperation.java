package com.gla.methods.Level3;
public class MatrixOperation {
    public static int[][] createMatrix(int rows, int cols) {
        int matrix[][] = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random()*10);
            }
        }

        return matrix;
    }
    public static int[][] addMatrix(int A[][], int B[][]) {
        int rows = A.length;
        int cols = A[0].length;

        int result[][] = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                result[i][j] = A[i][j] + B[i][j];

            }
        }

        return result;
    }
    public static int[][] subtractMatrix(int A[][], int B[][]) {
        int rows = A.length;
        int cols = A[0].length;
        int result[][] = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                result[i][j] = A[i][j] - B[i][j];

            }
        }

        return result;
    }
    public static int[][] multiplyMatrix(int A[][], int B[][]) {
        int rows = A.length;
        int cols = B[0].length;
        int result[][] = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                for(int k = 0; k < B.length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }

            }
        }

        return result;
    }
    public static void display(int matrix[][]) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int A[][] = createMatrix(3,3);
        int B[][] = createMatrix(3,3);

        System.out.println("Matrix A");
        display(A);

        System.out.println("\nMatrix B");
        display(B);

        System.out.println("\nAddition");
        display(addMatrix(A,B));

        System.out.println("\nSubtraction");
        display(subtractMatrix(A,B));

        System.out.println("\nMultiplication");
        display(multiplyMatrix(A,B));
    }
}
