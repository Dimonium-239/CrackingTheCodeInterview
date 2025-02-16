package com.github.dimonium_239.Chapter_1_ArraysAndStrings.Task_9_StringRotation;

public class StringRotating {
    public static void main(String[] args) {
        System.out.println(isSubstring("waterbottle", "aterbottlew"));
    }

    public static boolean isSubstring(String str1, String str2){
        StringBuilder strB1 = new StringBuilder(str1);

        int iterator = 0;
        int len = str1.length();
        while(!strB1.toString().equals(str2) && iterator <= len){
            char charFromEnd = strB1.charAt(strB1.length()-1);
            strB1 = strB1.reverse().append(charFromEnd).reverse();
            strB1 = strB1.deleteCharAt(strB1.length()-1);
            iterator++;
        }
        return strB1.toString().equals(str2);
    }

}
