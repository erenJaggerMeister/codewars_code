import java.util.*;

public class splitString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String inputString = sc.next();
        String[] getResult = solution(inputString);
        for (int i = 0; i < getResult.length; i++) {
            System.out.print(getResult[i] + " ");
        }
    }

    public static String[] solution(String s) {
        int numberSizeArray = (s.length() % 2 == 0) ? (s.length() / 2) : ((s.length() + 1) / 2);
        String[] resultString = new String[numberSizeArray];
        // declare array
        for (int i = 0; i < resultString.length; i++) {
            resultString[i] = "";
        }
        // check if length string is even or odd
        if (s.length() % 2 == 0) {
            // put character on string to array string
            for (int i = 0; i < s.length(); i++) {
                int positionIndex = i / 2;
                resultString[positionIndex] = resultString[positionIndex] + s.charAt(i);
            }
        } else {
            // put character on string to array string
            for (int i = 0; i < s.length(); i++) {
                int positionIndex = i / 2;
                resultString[positionIndex] = resultString[positionIndex] + s.charAt(i);
            }
            // because string length is odd then the last index in array should add "_"
            resultString[resultString.length - 1] = resultString[resultString.length - 1] + "_";
        }

        return resultString;
    }
}
