import java.util.*;

public class mapChar {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String putString = sc.next();
        Map<Character, Integer> d = count(putString);
        System.out.println(d);
    }

    public static Map<Character, Integer> count(String str) {
        // Happy coding!
        Map<Character, Integer> charMap = new HashMap<>();
        //
        for (int i = 0; i < str.length(); i++) {
            char takeChar = str.charAt(i);
            // if size map still empty we put the character
            if (charMap.size() == 0) {
                charMap.put(takeChar, 1);
            } else { // if map size not 0
                // check if character right now already in map or not
                if (charMap.containsKey(str.charAt(i))) {
                    char keyPut = str.charAt(i);
                    charMap.put(keyPut, charMap.get(keyPut) + 1);
                } else { // if there is no key in map
                    charMap.put(str.charAt(i), 1);
                }
            }
        }
        return charMap;
    }
}
