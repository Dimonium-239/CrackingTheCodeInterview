package com.github.dimonium_239.Chapter_1_ArraysAndStrings.Task_7_RotateMatrix;

public class Solution {
    public void rotateMatrix(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        print(matrix);
        rotator(matrix);
        print(matrix);

    }

    public void rotator(int[][] matrix){
        flip(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int swapper = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = swapper;
            }
        }
    }

    public void flip(int[][]matrix) {
        int elemCount = matrix.length - 1;
        int[] temp = matrix[elemCount];

        for (int i = elemCount; i > 0; i--)
            matrix[i] = matrix[elemCount-i];

        matrix[0] = temp;
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
