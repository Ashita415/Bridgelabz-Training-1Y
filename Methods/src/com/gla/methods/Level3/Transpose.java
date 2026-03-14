package com.gla.methods.Level3;
public class Transpose {
    public static void main(String[] args) {

        int A[][] = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                A[i][j] = (int)(Math.random()*10);
            }
        }

        System.out.println("Matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nTranspose");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(A[j][i] + " ");
            }
            System.out.println();
        }
        int det = A[0][0]*A[1][1] - A[0][1]*A[1][0];
        System.out.println("\nDeterminant = " + det);

        System.out.println("\nInverse");
        if(det == 0){
            System.out.println("Inverse not possible");
        }
        else{

            double inv[][] = new double[2][2];

            inv[0][0] = A[1][1]/(double)det;
            inv[0][1] = -A[0][1]/(double)det;
            inv[1][0] = -A[1][0]/(double)det;
            inv[1][1] = A[0][0]/(double)det;

            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print(inv[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
