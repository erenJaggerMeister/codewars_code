import java.util.*;

public class convertString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String getStr = sc.next();
        char[] temp1 = getStr.toCharArray();
        // print untuk range 65-90 dan 97 sampai122
        // ubah setelah char selain range 65-90 dan 97-122
        String newRes = "";
        for (int i = 0; i < temp1.length; i++) {
            int numTemp = temp1[i];
            if ((numTemp >= 65 && numTemp <= 90) || (numTemp >= 97 && numTemp <= 122)) {
                newRes = newRes + temp1[i];
                System.out.print(temp1[i]);
            } else {
                i++;
                numTemp = temp1[i];
                if (numTemp >= 97) {
                    numTemp = numTemp - 97;
                    numTemp = numTemp + 65;
                    System.out.print((char) numTemp);
                    newRes = newRes + ((char) numTemp);
                } else {
                    System.out.print((char) numTemp);
                    newRes = newRes + ((char) numTemp);
                }
            }
        }
        System.out.println("hasil akhir string baru = " + newRes);
    }
}