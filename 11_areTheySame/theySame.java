import java.util.*;

public class theySame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // int[] arrA = { 121, 144, 19, 161, 19, 144, 19, 11 };
        // int[] arrB = { 121, 14641, 20736, 361, 25921, 361, 20736, 361 };
        // test case 2
        // int[] arrA = { 121, 144, 19, 161, 19, 144, 19, 11 };
        // int[] arrB = { 132, 14641, 20736, 361, 25921, 361, 20736, 361 };
        // testCase 3
        // int[] arrA = { 121, 144, 19, 161, 19, 144, 19, 11 };
        // int[] arrB = { 121, 14641, 20736, 36100, 25921, 361, 20736, 361 };
        // test case 4
        // int[] arrA = {};
        // int[] arrB = { 121, 14641, 20736, 36100, 25921, 361, 20736, 361 };
        // test case 5
        int[] arrA = { 121, 144, 19, 161, 19, 144, 19, 11 };
        int[] arrB = {};
        System.out.println(comp(arrA, arrB));
    }

    public static boolean comp(int[] a, int[] b) {
        boolean checkCompare = true;
        // check if one of their's length is 0
        if (a.length == 0 || b.length == 0) {
            return false;
        }
        for (int i = 0; i < b.length; i++) {
            // take integer from element b and make it to float or double
            double numRoot = b[i];
            double numFloor, numCeil = 0;// to check if we have 2 number different
            numRoot = Math.sqrt(numRoot);
            numFloor = Math.floor(numRoot);
            numCeil = Math.ceil(numRoot);
            if (numRoot != numFloor || numRoot != numCeil) {
                return false;
            } else {
                // check every element in array a
                boolean keepCheck = false;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == (int) numRoot) {
                        keepCheck = true;
                    }
                }
                // if while looping we do not find equals number then return false
                if (keepCheck == false) {
                    return false;
                }
            }
        }
        return checkCompare;
    }
}
