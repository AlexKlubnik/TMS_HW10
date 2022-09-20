package HW10;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        String str = "sadsa asdsa  rewrwe ds fdsdaasdw, dsf: dasd. adeweqeqw 21";

        String smallestWord =
                Arrays.stream(str.split("\\W+"))
                        .min((word1, word2) -> word1.length() - word2.length())
                        .get();
        System.out.println("Smallest word is: " + smallestWord);

        String biggestWord =
                Arrays.stream(str.split("\\W+"))
                        .max((word1, word2) -> word1.length() - word2.length())
                        .get();
        System.out.println("Biggest word is: " + biggestWord);

        /* String[] words = str.split("\\W+");

        String biggestWord = words[0];
        String smallestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() >= biggestWord.length()) {
                biggestWord = words[i];
            } else if (words[i].length() <= smallestWord.length()) {
                smallestWord = words[i];
            }
} */


    }
}
