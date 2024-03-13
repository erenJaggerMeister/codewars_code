import java.util.*;

public class stringRotate {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String tester = "EBG13 rknzcyr";
        String[] arr1 = tester.split("");
        for (String elem : arr1) {
            System.out.print(elem);
        }
        rot13("EBG13 rknzcyr.");
        rot13("This is my first ROT13 excercise!");
    }

    public static String rot13(String message) {
        Map<String, String> libraryAlph = new HashMap<String, String>();
        String[] lib1 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                "t", "u", "v", "w", "x", "y", "z" };
        for (int i = 0; i < 13; i++) {
            libraryAlph.put(lib1[i], lib1[i + 13]);
        }
        for (int i = 13; i < 26; i++) {
            libraryAlph.put(lib1[i], lib1[i - 13]);
        }
        String[] lib2 = new String[26];
        for (int i = 0; i < 26; i++) {
            lib2[i] = lib1[i].toUpperCase();
        }
        for (int i = 0; i < 13; i++) {
            libraryAlph.put(lib2[i], lib2[i + 13]);
        }
        for (int i = 13; i < 26; i++) {
            libraryAlph.put(lib2[i], lib2[i - 13]);
        }
        // System.out.println(libraryAlph.entrySet());
        String newString = "";
        String[] arrayConvStr = message.split("");
        for (int j = 0; j < arrayConvStr.length; j++) {
            String getter = (libraryAlph.containsKey(arrayConvStr[j])) ? libraryAlph.get(arrayConvStr[j])
                    : arrayConvStr[j];
            newString = newString + getter;
        }
        // System.out.println(newString);
        return newString;
    }
}
