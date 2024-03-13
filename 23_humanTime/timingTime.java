import java.util.*;

public class timingTime {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        makeReadable(0);
        makeReadable(5);
        makeReadable(60);
        makeReadable(86399);
        makeReadable(359999);
    }

    public static String makeReadable(int seconds) {
        // Do something
        String newString = "";
        int dvd = 3600;
        for (int i = 0; i < 3; i++) {
            int timeTemp = seconds / dvd;
            seconds = seconds % dvd;
            dvd = dvd / 60;
            String formatTime = String.format("%02d", timeTemp);
            if (i != 2) {
                newString = newString + formatTime + ":";
            } else {
                newString = newString + formatTime;
            }
        }
        // System.out.println(newString);
        return newString;
    }
}
