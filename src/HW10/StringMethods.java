package HW10;

import java.util.StringTokenizer;

public class StringMethods {

    String documentNumber;

    public StringMethods() {
    }

    static void docNumbers(String documentNumber) {

        String[] arr = documentNumber.split("-");

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0 && i < 3) {
                System.out.print(arr[i]);
            }
        }
    }


    static void numberWithoutLetters(String documentNumber) {
        char[] arr = documentNumber.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i]) && !(Character.isDigit(arr[i - 1]))) {
                arr[i] = '*';
            }
            System.out.print(arr[i]);
        }
    }

    static void onlyLetters(String documentNumber) {

        StringBuilder sb = new StringBuilder();

        documentNumber.toLowerCase();

        for (int i = 0; i < documentNumber.length(); i++) {
            if (Character.isLetter(documentNumber.charAt(i))) {
                sb.append(documentNumber.charAt(i));
            } else if (i > 0 && documentNumber.charAt(i - 1) == '-') {
                sb.append('/');
            } else if (i == documentNumber.length() - 2) {
                sb.append('/');
            }

        }
        System.out.println(sb);
    }

    static void onlyLetters1(String documentNumber) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < documentNumber.length(); i++) {
            if (Character.isLetter(documentNumber.charAt(i))) {
                sb.append(documentNumber.charAt(i));
            } else if (i > 0 && documentNumber.charAt(i - 1) == '-') {
                sb.append('/');
            } else if (i == documentNumber.length() - 2) {
                sb.append('/');
            }
        }
        System.out.println("Letters:" + sb.toString().toUpperCase());
    }
}


