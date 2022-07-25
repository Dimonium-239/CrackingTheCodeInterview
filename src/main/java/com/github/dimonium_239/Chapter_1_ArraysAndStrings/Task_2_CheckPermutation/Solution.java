package com.github.dimonium_239.Chapter_1_ArraysAndStrings.Task_2_CheckPermutation;

import java.util.Arrays;

public class Solution {
    
    protected static boolean isPermutation(String str1, String str2){
        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();
        Arrays.sort(str1Char);
        Arrays.sort(str2Char);
        return Arrays.equals(str1Char, str2Char);

    }

}
