package HW10;

public class Solution5 {
    public static void main(String[] args) {
        String str = "Hello world";

        StringBuilder doubledStr = new StringBuilder();

        for (char current : str.toCharArray()) {
            doubledStr
                    .append(current)
                    .append(current);
        }

//        for (int i = 0; i < str.length(); i++) {
//            char current = str.charAt(i);
//            doubledStr
//                    .append(current)
//                    .append(current);
//        }
        System.out.println(doubledStr);
    }
}
