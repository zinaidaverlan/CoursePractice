package Problems.Strings;

public class DigitSumFromString {
    public static int returnSum(String originalString) {
        int sum = 0;
        for (int i = 0; i < originalString.length() ; i++) {
            char character = originalString.charAt(i);
            if (Character.isDigit(character)) {
                sum += Integer.parseInt(String.valueOf(character));
            }
        }

        return sum;
    }
}
