package HW10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution3 {
    public static void main(String[] args) {

        String str = "sadasdas ab aabbbbcc cccc abcd abc abcde cccddd";

        List<Long> diffSymbols = Arrays.stream(str.split("\\W+"))
                .map(word -> word.chars()
                        .distinct()
                        .count())
                .collect(Collectors.toList());

        int minDiffPosition = diffSymbols.indexOf(Collections.min(diffSymbols));

        String[] strArray = str.split("\\W+");

        System.out.println(strArray[minDiffPosition]);


//        int[] diffSymbols = new int[words.size()];
//        for (int i = 0; i < diffSymbols.length; i++) {
//            diffSymbols[i] = differentSymbolsCount(words.get(i));
//    }
//
//
//    public static int differentSymbolsCount(String str) {
//
//        int diffSymbolCounter = 1;
//
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i + 1; j < str.length(); j++) {
//                if (str.charAt(j) != str.charAt(i)) {
//                    diffSymbolCounter++;
//                }
//            }
//        }
//        return diffSymbolCounter;
    }
}

