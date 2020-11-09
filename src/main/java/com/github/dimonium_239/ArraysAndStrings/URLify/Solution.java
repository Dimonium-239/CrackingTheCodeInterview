package com.github.dimonium_239.ArraysAndStrings.URLify;

public class Solution {

    protected static String urlify(String path, int size){
        char[] pathChar = path.toCharArray();
        int realSize = pathChar.length;
        int dSize = realSize - size;

        for (int i = realSize-1; i >= dSize; i--)
            pathChar[i] = pathChar[i-dSize];

        for (int i = dSize; i < realSize; i++) {
            if(pathChar[i] == ' '){
                pathChar[i-dSize] = '%';
                pathChar[i-dSize+1] = '2';
                pathChar[i-dSize+2] = '0';
                dSize -= 2;
            }
            else
                pathChar[i-dSize] = pathChar[i];
        }
        return String.valueOf(pathChar);
    }

    protected static String urlify2(String path, int size){
        char[] pathChar = path.toCharArray();
        int realSize = pathChar.length;

        char[] resultChar = new char[realSize];
        for (int i = 0, j=0; i < size; i++, j++){
            if(pathChar[i] == ' '){
                resultChar[j] = '%';
                resultChar[j+1] = '2';
                resultChar[j+2] = '0';
                j+=2;
            }
            else
                resultChar[j] = pathChar[i];
        }
        return String.valueOf(resultChar);
    }
}

