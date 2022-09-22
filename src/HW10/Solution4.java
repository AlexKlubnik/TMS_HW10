package HW10;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        String str = "wow lipstick tenet defender forward kayak";

        String[] strArray = str.split("\\s+");

        Scanner scan = new Scanner(System.in);

        System.out.println("You have " + strArray.length + " words. Type word number from 1 to " + strArray.length);

        while (true) {
            int wordNumber = scan.nextInt() - 1;

            if (wordNumber >= 0 && wordNumber < strArray.length) {
                if (isPalindrome(strArray[wordNumber]))
                    System.out.println("This word is a palindrome.");
                else System.out.println("This word isn't a palindrome.");
                break;
            } else
                System.out.println("Type word number from 1 to " + strArray.length);
        }
        scan.close();
    }

    public static boolean isPalindrome(String word) {
        char[] letters = word.toCharArray();
        int length = letters.length;
        for (int i = 0; i < length / 2; i++) {
            if (letters[i] != letters[length - 1 - i])
                return false;
        }
        return true;
    }

}

