import java.util.*;
import java.math.*;

public class findLast {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(lastDigit(BigInteger.valueOf(9), BigInteger.valueOf(7)));
        System.out.println(lastDigit(BigInteger.valueOf(2), BigInteger.valueOf(7)));
        System.out.println(lastDigit(BigInteger.valueOf(4), BigInteger.valueOf(2)));
        System.out.println(lastDigit(BigInteger.valueOf(2), BigInteger.valueOf(0)));
    }

    public static int lastDigit(BigInteger n1, BigInteger n2) {
        int newMod = 0;
        if (n2.equals(BigInteger.ZERO)) {
            return 1;
        }
        BigInteger agkPangkat = BigInteger.ZERO;
        BigInteger hasilPangkat = BigInteger.ONE;
        Map<Integer, BigInteger> mappingMod = new HashMap<>();
        for (BigInteger i = n2; i.compareTo(BigInteger.ZERO) > 0; i = i.subtract(BigInteger.ONE)) {
            hasilPangkat = hasilPangkat.multiply(n1);
            int hasilMod = hasilPangkat.remainder(BigInteger.TEN).intValue();
            if (!(mappingMod.containsKey(hasilMod))) {
                mappingMod.put(hasilMod, agkPangkat);
            } else {
                mappingMod.put(hasilMod, agkPangkat);
            }
            System.out.println(hasilPangkat);
            System.out.println(mappingMod.entrySet());
            agkPangkat.add(BigInteger.ONE);
        }
        return newMod;
    }
}
