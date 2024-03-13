import java.util.*;

public class convertToHexa {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(rgb(255, 255, 255));
        System.out.println(rgb(255, 255, 300));
        System.out.println(rgb(0, 0, 0));
        System.out.println(rgb(148, 0, 211));
    }

    public static String rgb(int r, int g, int b) {
        String redConv = converterStr(r);
        String greenConv = converterStr(g);
        String blueConv = converterStr(b);
        String strFinal = redConv + greenConv + blueConv;
        strFinal = strFinal.toUpperCase();
        return strFinal;
    }

    public static String converterStr(int colour) {
        if (colour <= 0) {
            return "00";
        }
        if (colour >= 255) {
            return "FF";
        }
        String getHexa = Integer.toHexString(colour);
        if (getHexa.length() == 1) {
            getHexa = "0" + getHexa;
        }
        return getHexa;
    }
}
