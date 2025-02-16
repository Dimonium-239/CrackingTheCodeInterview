package com.github.dimonium_239.Chapter_1_ArraysAndStrings.Task_5_OneAway;

public class OneAway {
    public static void main(String[] args) {
        System.out.println("pale, palea -> " + oneAway("pale", "palea"));
    }

    protected static boolean oneAway(String word1, String word2){
        StringBuilder word2Sb = new StringBuilder(word2);
        StringBuilder word1Sb = new StringBuilder(word1);
        int counterOfDifference = 0;
        if(word2.length()>word1.length()) counterOfDifference++;
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            boolean isMapped = word1Sb.charAt(i) != word2Sb.charAt(i);
            int l1 = word1Sb.length();
            int l2 = word2Sb.length();
            if (l1 > l2) {
                if (isMapped) {
                    word2Sb.insert(i, word1.charAt(i));
                    counterOfDifference++;
                }
            } else if (l1 < l2) {
                if (isMapped) {
                    word2Sb.deleteCharAt(i);
                    counterOfDifference++;
                }
            }else{
                if (isMapped) {
                    counterOfDifference++;
                }
            }
            if (counterOfDifference > 1) return false;
        }
        return true;
    }
}
