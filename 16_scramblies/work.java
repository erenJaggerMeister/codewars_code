import java.util.*;

public class work {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw", "world"));
        System.out.println(scramble("cedewaraaossoqqyt", "codewars"));
        System.out.println(scramble("katas", "steak"));
        System.out.println(scramble("scriptjavx", "javascript"));
        System.out.println(scramble("scriptingjava", "javascript"));
        System.out.println(scramble("scriptsjava", "javascripts"));
        System.out.println(scramble("javscripts", "javascript"));
        System.out.println(scramble("aabbcamaomsccdd", "commas"));
        System.out.println(scramble("commas", "commas"));
        System.out.println(scramble("sammoc", "commas"));

    }

    public static boolean scramble(String str1, String str2) {
        boolean checkChar = true;
        // first string
        Map<Character, Integer> firstMap = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            boolean checkCharTemp = firstMap.containsKey(str1.charAt(i)) ? true : false;
            if (checkCharTemp == false) {
                firstMap.put(str1.charAt(i), 1);
            } else {
                firstMap.put(str1.charAt(i), firstMap.get(str1.charAt(i)) + 1);
            }
        }
        // second string
        for (int i = 0; i < str2.length(); i++) {
            char tempChar = str2.charAt(i);
            boolean checkExist = firstMap.containsKey(tempChar) ? true : false;
            if (checkExist == false) {
                checkChar = false;
                break;
            } else {
                if (firstMap.get(str2.charAt(i)) > 0) {
                    firstMap.put(str2.charAt(i), firstMap.get(str2.charAt(i)) - 1);
                } else {
                    checkChar = false;
                    break;
                }
            }
        }
        return checkChar;
    }
}
