import java.util.*;

public class simplePigLatin {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String inputMasuk = sc.nextLine();
        // System.out.println("hasil akhir adalah " + pigIt(inputMasuk));
        System.out.println(pigIt(inputMasuk));
    }

    public static String pigIt(String iptStr) {
        String newString = "";
        String[] arrConvert = iptStr.split(" ");
        // check if the last char is '!,etc'
        char lastCharCheck = arrConvert[arrConvert.length - 1].charAt(0);
        if ((int) lastCharCheck != 33 && (int) lastCharCheck != 63) {
            // try print out array
            // for (int i = 0; i < arrConvert.length; i++) {
            // System.out.print(arrConvert[i] + " ");
            // }
            // System.out.println();
            //
            // when exaple word "Hello" become => "elloHay"
            for (int i = 0; i < arrConvert.length; i++) {
                char takeFirstChar = arrConvert[i].charAt(0);
                String newTempString = arrConvert[i].substring(1);
                newTempString = newTempString + takeFirstChar + "ay";
                // try print
                // System.out.println(newTempString);
                // put it into new String
                if (i != arrConvert.length - 1) {
                    newString = newString + newTempString + " ";
                } else {
                    newString = newString + newTempString;
                }
            }
        } else {
            // try print out array
            // for (int i = 0; i < arrConvert.length; i++) {
            // System.out.print(arrConvert[i] + " ");
            // }
            // System.out.println();
            //
            // when exaple word "Hello" become => "elloHay"
            for (int i = 0; i < arrConvert.length - 1; i++) {
                char takeFirstChar = arrConvert[i].charAt(0);
                String newTempString = arrConvert[i].substring(1);
                newTempString = newTempString + takeFirstChar + "ay";
                // try print
                // System.out.println(newTempString);
                // put it into new String
                if (i != arrConvert.length - 1) {
                    newString = newString + newTempString + " ";
                } else {
                    newString = newString + newTempString;
                }
            }
            newString = newString + "" + lastCharCheck;
        }
        // try print out array
        // for (int i = 0; i < arrConvert.length; i++) {
        // System.out.print(arrConvert[i] + " ");
        // }
        // System.out.println();
        //
        // when exaple word "Hello" become => "elloHay"
        // for (int i = 0; i < arrConvert.length; i++) {
        // char takeFirstChar = arrConvert[i].charAt(0);
        // String newTempString = arrConvert[i].substring(1);
        // newTempString = newTempString + takeFirstChar + "ay";
        // // try print
        // // System.out.println(newTempString);
        // // put it into new String
        // if (i != arrConvert.length - 1) {
        // newString = newString + newTempString + " ";
        // } else {
        // newString = newString + newTempString;
        // }
        // }

        return newString;
    }
}