package com.github.dimonium_239.Chapter_1_ArraysAndStrings.Task_3_URLify;

public class Main {
    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        str = Solution.urlify2(str, 13);
        System.out.println(str);
    }
}
