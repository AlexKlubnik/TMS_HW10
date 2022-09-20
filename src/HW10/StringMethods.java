package HW10;

public class StringMethods {

    String documentNumber;

    static void printDocNumbers(String documentNumber) {

        System.out.println(documentNumber.substring(0, 4) + documentNumber.substring(9, 13));

    }

    static void printNumberWithoutLetters(String documentNumber) {

        documentNumber = documentNumber.replace((documentNumber.substring(5, 8)), "***");
        documentNumber = documentNumber.replace((documentNumber.substring(14, 17)), "***");
        System.out.println(documentNumber);
    }

    static void printOnlyLetters(String documentNumber) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < documentNumber.length(); i++) {
            if (Character.isLetter(documentNumber.charAt(i))) {
                sb.append(documentNumber.charAt(i));
            } else if (i > 0 && documentNumber.charAt(i - 1) == '-' || i == documentNumber.length() - 2) {
                sb.append('/');
            }
        }
        System.out.println(sb);
    }

    static void printOnlyLetters1(String documentNumber) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < documentNumber.length(); i++) {
            if (Character.isLetter(documentNumber.charAt(i))) {
                sb.append(documentNumber.charAt(i));
            } else if (i > 0 && documentNumber.charAt(i - 1) == '-' || i == documentNumber.length() - 2) {
                sb.append('/');
            }
        }
        System.out.println("Letters:" + sb.toString().toUpperCase());
    }

    static void containsAbc(String documentNumber) {

        System.out.println(documentNumber.toLowerCase().contains("abc"));
    }

    static void startsWith555(String documentNumber) {
        System.out.println(documentNumber.startsWith("555"));
    }

    static void endsWith1a2b(String documentNumber) {
        System.out.println(documentNumber.endsWith("1a2b"));
    }

}


