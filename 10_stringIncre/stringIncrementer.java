import java.util.*;

public class stringIncrementer {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String inputStr = sc.next();
        System.out.println("hasil adalah " + incrementString(inputStr));
    }

    public static String incrementString(String str) {
        String newString = "";
        String[] tempArr = str.split("(?<=\\D)(?=\\d)");
        // print
        for (int i = 0; i < tempArr.length; i++) {
            System.out.println(tempArr[i] + " ");
        }
        String sentences = tempArr[0];
        if (tempArr.length == 1 || tempArr.length == 0) {
            newString = newString + sentences + "1";
        } else {
            // check number length
            // 002 length is 3
            // 123 length is 3
            int numLength = tempArr[1].length();
            // get number from string
            int takeNumber = Integer.parseInt(tempArr[1]);
            takeNumber++;
            // convert to string
            String convString = Integer.toString(takeNumber);
            // if length convert number is not equals with numLength
            if (convString.length() != numLength) {
                while (convString.length() != numLength) {
                    convString = "0" + convString;
                }
            }
            newString = newString + tempArr[0] + convString;
        }
        return newString;
    }
}
