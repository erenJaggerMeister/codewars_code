import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkSecure {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String tester1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        System.out.println(alphanumeric(tester1));
        String tester2 = "";
        System.out.println(alphanumeric(tester2));
        String tester3 = "with space";
        System.out.println(alphanumeric(tester3));
        String tester4 = "with_underscore";
        System.out.println(alphanumeric(tester4));
        String tester5 = "woAz";
        System.out.println(alphanumeric(tester5));
    }

    public static boolean alphanumeric(String s) {
        // boolean checkAlphanumeric = true;
        // // if string is ""
        // boolean checkLengthString = s.length() == 0 ? true : false;
        // if (checkLengthString == true) {
        // return false;
        // }
        // // if string contain "_"
        // boolean checkUnderscore = s.contains("_");
        // if (checkUnderscore == true) {
        // return false;
        // }
        // // check if there is whitespace
        // boolean checkWhitespace = s.contains(" ");
        // if (checkWhitespace == true) {
        // return false;
        // }
        // // check if string doesn't contain number
        // String pattern = ".*\\d+.*";
        // Pattern regex = Pattern.compile(pattern);
        // Matcher matcher = regex.matcher(s);
        // if (!(matcher.matches())) {
        // String pattString = "^(?=.*[a-z])(?=.*[A-Z])[a-zA-Z]+$";
        // Pattern regexPatt = Pattern.compile(pattString);
        // Matcher matchPatt = regexPatt.matcher(s);
        // if (matchPatt.matches()) {
        // return true;
        // } else {
        // return false;
        // }
        // }
        // // check characters are uppercase / lowercase latin letters and digits from 0
        // to
        // // 9
        // String patternChecker = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]+$";
        // Pattern regexCheck = Pattern.compile(patternChecker);
        // Matcher matchCheck = regexCheck.matcher(s);
        // if (!(matchCheck.matches())) {
        // return false;
        // }
        // return checkAlphanumeric;
        String pattern = "^[a-zA-Z0-9]+$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);

        return matcher.matches();
    }
}
