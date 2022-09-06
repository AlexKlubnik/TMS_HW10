package HW10;

public class StringHW {
    public static void main(String[] args) {
        String documentNumber = "0123-abc-4567-def-8g9h";

        StringMethods.docNumbers(documentNumber);
        System.out.println("\n-----------------------------");
        StringMethods.numberWithoutLetters(documentNumber);
        System.out.println("\n-----------------------------");
        StringMethods.onlyLetters(documentNumber);
        System.out.println("\n-----------------------------");
        StringMethods.onlyLetters1(documentNumber);
    }
}
