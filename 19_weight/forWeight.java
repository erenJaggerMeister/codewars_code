import java.util.*;

public class forWeight {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String testString = "56 65 74 100 99 68 86 180 90";
        String[] arrayTest = testString.split(" ");
        for (String element : arrayTest) {
            System.out.print(element + " ");
        }
        System.out.println();
        int[] simpanAngka = new int[arrayTest.length];
        // hitung total dari setiap element
        for (int i = 0; i < simpanAngka.length; i++) {
            int totalLength = arrayTest[i].length();
            System.out.println("panjang angka adalah " + totalLength);
            int tempNumber = Integer.parseInt(arrayTest[i]);
            System.out.println("tempNumber adalah = " + tempNumber);
            int sepuluhAngka = (int) Math.pow(10.0, (totalLength * 1.0));
            sepuluhAngka = sepuluhAngka / 10;
            System.out.println("angka kuadrat = " + sepuluhAngka);
            int tempTotal = 0;
            // hitung pertambahan
            for (int x = 0; x < totalLength; x++) {
                int getBagi = tempNumber / sepuluhAngka;
                tempTotal = tempTotal + getBagi;
                tempNumber = tempNumber % sepuluhAngka;
                sepuluhAngka = sepuluhAngka / 10;
            }
            System.out.println("dari angka = " + tempNumber + " ,totalnya adalah = " + tempTotal);
            simpanAngka[i] = tempTotal;
        }
        // print total elemen angka
        for (int element : simpanAngka) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
