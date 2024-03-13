import java.util.*;

public class camelCase {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String getString = sc.next();
        String strResut = camelCase1(getString);
        System.out.println(strResut);
    }

    public static String camelCase1(String input) {
        String newStringResult = "";
        String[] arrStr = input.split("(?=\\p{Lu})");// split by upper case
        // for (int i = 0; i < arrStr.length; i++) {
        // System.out.println(arrStr[i] + " ");
        // }
        // put array element into new string
        for (int i = 0; i < arrStr.length; i++) {
            if (i != arrStr.length - 1) {
                newStringResult = newStringResult + arrStr[i] + " ";
            } else {
                newStringResult = newStringResult + arrStr[i];
            }
        }
        return newStringResult;
    }
}
