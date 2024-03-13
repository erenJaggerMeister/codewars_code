import java.util.*;

public class encryptCodePseudo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String getText = sc.nextLine();
        sc.close();
        int itrNum = sc.nextInt();
        encrypt(getText, itrNum);
    }

    public static String encrypt(final String text, final int n) {
        // Your code here
        String getText = text;
        for (int i = 0; i < n; i++) {
            String tempString = "";
            // for odd index
            for (int y = 0; y < text.length(); y++) {
                tempString = (y % 2 != 0) ? (tempString + getText.charAt(y)) : tempString;
            }
            // for even index
            for (int x = 0; x < getText.length(); x++) {
                tempString = (x % 2 == 0) ? (tempString + getText.charAt(x)) : tempString;
            }
            getText = tempString;
            System.out.println(getText);
        }
        return null;
    }

    public static String decrypt(final String encryptedText, final int n) {
        // Your code here
        return null;
    }
}
