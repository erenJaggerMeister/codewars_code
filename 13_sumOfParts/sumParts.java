import java.util.*;

public class sumParts {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrNum = { 0, 1, 3, 6, 10 };
        int[] getTotalSum = sumParts(arrNum);
        for (int i = 0; i < getTotalSum.length; i++) {
            System.out.print(getTotalSum[i] + " ");
        }
        System.out.println();
        int[] arrNum2 = { 1, 2, 3, 4, 5, 6 };
        int[] arrTotal = sumParts(arrNum2);
        int[] arrNum3 = { 1 };
        int[] arrTotal2 = sumParts(arrNum3);
        for (int i = 0; i < arrTotal2.length; i++) {
            System.out.print(arrTotal2[i] + " ");
        }
    }

    public static int[] sumParts(int[] ls) {
        // your code
        int[] tempArr = new int[ls.length + 1];
        if (tempArr.length == 1) {
            tempArr[0] = 0;
        } else {
            // complexity time O(n^2)
            // for (int i = 0; i < ls.length; i++) {
            // int totalTempSum = ls[i];
            // for (int j = i + 1; j < ls.length; j++) {
            // totalTempSum += ls[j];
            // }
            // tempArr[i] = totalTempSum;
            // }
            int totalTempSum = 0;
            for (int i = ls.length - 1; i >= 0; i--) {
                totalTempSum += ls[i];
                tempArr[i] = totalTempSum;
            }
            tempArr[tempArr.length - 1] = 0;
        }
        return tempArr;
    }
}
