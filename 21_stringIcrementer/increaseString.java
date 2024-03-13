import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class increaseString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(incrementString("foobar2013"));
        System.out.println(incrementString("foo0019"));
        System.out.println(incrementString("foo"));
        System.out.println(incrementString("foo000"));
    }

    public static String incrementString(String str) {
        // String[] tempString = str.split("(?<=\\D)(?=\\d)");
        // // for (String e : tempString) {
        // // System.out.println(e);
        // // }
        // String finalString = "";
        // // if length string is 0
        // if (str.length() == 0) {
        // return "1";
        // }
        // // if string doesnt contain number
        // if (tempString.length == 1) {
        // finalString += tempString[0] + "1";
        // } else { // contain number
        // int lengthNumberString = tempString[1].length();
        // int convertNumber = Integer.parseInt(tempString[1]);
        // convertNumber += 1;
        // String backToString = Integer.toString(convertNumber);
        // if (lengthNumberString != backToString.length()) {
        // while (backToString.length() != lengthNumberString) {
        // backToString = "0" + backToString;
        // }
        // finalString = finalString + tempString[0] + backToString;
        // } else {
        // finalString = finalString + tempString[0] + backToString;
        // }
        // }
        // return finalString; // you code here
        if (str.isEmpty()) {
            return "1";
        }

        String[] tempString = str.split("(?<=\\D)(?=\\d)");
        int number = 1;

        if (tempString.length > 1) {
            int lengthNumberString = tempString[1].length();
            number = Integer.parseInt(tempString[1]) + 1;
            String format = String.format("%0" + lengthNumberString + "d", number);
            return tempString[0] + format;
        }

        return tempString[0] + number;
    }
}
