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

}


