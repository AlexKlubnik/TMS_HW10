package HW10;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        String str = "wow lipstick tenet defender forward kayak";

        String[] strArray = str.split("\\s+");

        Scanner scan = new Scanner(System.in);

        System.out.println("You have " + strArray.length + " words. Type word number from 1 to 6:");

        while (true) {
            int wordNumber = scan.nextInt() - 1;

            if (wordNumber < 0 || wordNumber >= strArray.length)
                System.out.println("Type word number from 1 to 6:");

            else if (wordNumber >= 0 && wordNumber < strArray.length) {

                String reversedWord = new StringBuilder(strArray[wordNumber]).reverse().toString();

                if (strArray[wordNumber].equals(reversedWord)) {
                    System.out.println("This word is a palindrome.");
                } else {
                    System.out.println("This word isn't a palindrome.");
                }
                break;
            }
        }
        scan.close();
    }

}

