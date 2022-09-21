package HW10;

public class Solution5 {
    public static void main(String[] args) {
        String str = "Hello world";

        StringBuilder doubledStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            doubledStr.append(str.charAt(i));
            doubledStr.append(str.charAt(i));
        }
        System.out.println(doubledStr);
    }
}
