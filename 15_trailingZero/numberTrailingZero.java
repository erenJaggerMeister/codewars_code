import java.math.BigInteger;
import java.util.*;

public class numberTrailingZero {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int getNumFactorial = sc.nextInt();
        System.out.println(zeros(getNumFactorial));
    }

    public static int zeros(int n) {
        // your beatiful code here
        // BigInteger total = new BigInteger("1");
        // for (long i = 1; i <= n; i++) {
        // String getI = Long.toString(i);
        // total = total.multiply(new BigInteger(getI));
        // }
        // // System.out.println("hasil perkalian = " + total);
        // String convertNumber = total.toString();
        // int countZero = 0;
        // for (int i = convertNumber.length() - 1; i >= 0; i--) {
        // if (convertNumber.charAt(i) == '0') {
        // countZero++;
        // }
        // if (countZero != 0 && convertNumber.charAt(i) != '0') {
        // break;
        // }
        // }
        int countZero = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            countZero += n / i;
        }

        return countZero;
    }
}
