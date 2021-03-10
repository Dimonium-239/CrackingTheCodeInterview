package com.github.dimonium_239.ArraysAndStrings.ZeroMatrix;

public class Solution {

    private void zeroCol(int[][]matrix, int col){
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

    private void zeroRow(int[][]matrix, int row){
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;
        }
    }

    public void makeZero(){
        int[][] matrix = {{1,2,3,4},{4,1,2,6},{3,7,8,9}};
        int numberToRemove = 3;

        print(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == numberToRemove){
                    zeroCol(matrix, j);
                    zeroRow(matrix, i);
                }
            }
        }

        print(matrix);
    }

    public void print(int[][] matrix){
        for (int[] ints : matrix) {
            for (int j : ints)
                System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();
    }

}
