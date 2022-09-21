package HW10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution3 {
    public static void main(String[] args) {

        String str = "sadasdas ab aabbbbcc cccc abcd abc abcde cccddd";

        List<Long> diffSymbolsList = Arrays.stream(str.split("\\W+"))
                .map(word -> word.chars()
                        .distinct()
                        .count())
                .collect(Collectors.toList());

        int minDiffPosition = diffSymbolsList.indexOf(Collections.min(diffSymbolsList));

        String[] strArray = str.split("\\W+");

        System.out.println(strArray[minDiffPosition]);

    }
}

