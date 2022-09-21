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
        documentNumber = documentNumber.toLowerCase();

        System.out.println(documentNumber.substring(5, 8) + '/'
                        + documentNumber.substring(14, 17) + '/'
                        + documentNumber.charAt(19) + '/'
                        + documentNumber.charAt(21));

//        for (int i = 0; i < documentNumber.length(); i++) {
//            if (Character.isLetter(documentNumber.charAt(i))) {
//                onlyLetters.append(documentNumber.charAt(i));
//            } else if (i > 0 && documentNumber.charAt(i - 1) == '-' || i == documentNumber.length() - 2) {
//                onlyLetters.append('/');
//            }
//        }
        //      System.out.println(onlyLetters);
    }

    static void printOnlyLetters1(String documentNumber) {

        StringBuilder onlyLetters = new StringBuilder();

        onlyLetters
                .append(documentNumber, 5, 8)
                .append('/')
                .append(documentNumber, 14, 17)
                .append('/')
                .append(documentNumber.charAt(19))
                .append('/')
                .append(documentNumber.charAt(21));

//        for (int i = 0; i < documentNumber.length(); i++) {
//            if (Character.isLetter(documentNumber.charAt(i))) {
//                onlyLetters.append(documentNumber.charAt(i));
//            } else if (i > 0 && documentNumber.charAt(i - 1) == '-' || i == documentNumber.length() - 2) {
//                onlyLetters.append('/');
//            }
//        }
        System.out.println("Letters:" + onlyLetters.toString().toUpperCase());
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


