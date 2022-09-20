package HW10;

public class Solution1 {
    public static void main(String[] args) {
        String documentNumber = "5543-abC-4567-def-1a2c";

        StringMethods.printDocNumbers(documentNumber);
        System.out.println("\n-----------------------------");

        StringMethods.printNumberWithoutLetters(documentNumber);
        System.out.println("\n-----------------------------");

        StringMethods.printOnlyLetters(documentNumber);
        System.out.println("\n-----------------------------");

        StringMethods.printOnlyLetters1(documentNumber);
        System.out.println("\n-----------------------------");

        StringMethods.containsAbc(documentNumber);
        System.out.println("\n-----------------------------");

        StringMethods.startsWith555(documentNumber);
        System.out.println("\n-----------------------------");

        StringMethods.endsWith1a2b(documentNumber);
        System.out.println("\n-----------------------------");
    }
}
