import java.util.*;

public class mergeString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    }

    public static boolean isMerge(String s, String part1, String part2) {
        int indexParent = 0;
        int indexChild1, indexChild2;
        indexChild1 = 0;
        indexChild2 = 0;
        boolean checkher = true;
        while (indexParent != s.length() - 1) {
            if (s.charAt(indexParent) == part1.charAt(indexChild1)) {
                indexChild1++;
                indexParent++;
            } else if (s.charAt(indexParent) != part2.charAt(indexChild2)) {
                indexChild2++;
                indexParent++;
            } else {
                checkher = false;
                break;
            }
        }
        return checkher;
    }
}
