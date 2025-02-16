package com.github.dimonium_239.Chapter_1_ArraysAndStrings.Task_1_IsUnique;

import java.util.Arrays;

public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique2("asdf"));
    }

    protected static boolean isUnique(String str){
        char[] strChar = str.toCharArray();
        int size = strChar.length;

        Arrays.sort(strChar);

        for (int i = 0; i < size-1; i++)
            if(strChar[i] == strChar[i+1])
                return false;
        return true;
    }

    protected static boolean isUnique2(String str){
        char[] strChar = str.toCharArray();
        int size = strChar.length;

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if(i != j && strChar[i] == strChar[j])
                    return false;
            }
        }
        return true;
    }
}
