package com.github.dimonium_239.ArraysAndStrings.CompressString;

public class Solution {
    void compressString(String word){
        String resultWord = "";

        int counter = 0;
        char letter = word.charAt(0);

        for(char l : word.toCharArray()){
            if(l == letter)
                counter++;
            else{
                resultWord += letter;
                resultWord += String.valueOf(counter);
                letter = l;
                counter = 1;
            }
        }
        resultWord += letter;
        resultWord += String.valueOf(counter);

        System.out.println("Original word: " + word);
        System.out.println("Compared word: " + resultWord);
    }
}
