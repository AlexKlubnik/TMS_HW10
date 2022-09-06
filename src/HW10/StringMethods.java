package HW10;

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

}


