package com.github.dimonium_239.ArraysAndStrings.PalindromePermutation;

import java.util.*;

public class Solution {

    boolean palindromePermutation(String word){
        word = word.replace(" ", "");
        Stack<Character> sbWord = new Stack<>();

        for (Character c : word.toCharArray()) sbWord.add(c);

        HashMap<Character, Integer> wordCounter = new HashMap<>();

        while (!sbWord.empty()){
            Character ch = sbWord.pop();
            if(!wordCounter.containsKey(ch)) {
                int counter = 1;
                for (char c : sbWord) if (ch == c) counter++;
                wordCounter.put(ch, counter);
            }
        }

        if(word.length() % 2 == 0){
            for (int c : wordCounter.values()) if (c % 2 != 0) return false;
        } else {
            boolean flag = false;
            for (int c : wordCounter.values())
                if(c % 2 != 0)
                    if(!flag) flag = true;
                    else return false;
        }
        return true;
    }
}
