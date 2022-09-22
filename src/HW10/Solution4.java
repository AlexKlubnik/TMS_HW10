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
                String temp = strArray[wordNumber];

                for (int i = 0; i < temp.length() / 2; ) {
                    if (temp.charAt(i) != temp.charAt(temp.length() - 1 - i)){
                        System.out.println("This word isn't a palindrome.");
                        break;
                    }
                    if (temp.charAt(i) == temp.charAt(temp.length() - 1 - i))
                        i++;

                    if (i == temp.length() / 2 ) {
                        System.out.println("This word is a palindrome.");
                    }
                }
                break;
            } else
                System.out.println("Type word number from 1 to " + strArray.length);
        }
        scan.close();
    }

}

