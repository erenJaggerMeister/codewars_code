import java.util.*;

public class readableHours {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // int getSec = sc.nextInt();
        // System.out.println(formatDuration(getSec));
        while (sc.hasNextLine()) {
            String get1 = sc.next();
            int get2 = Integer.parseInt(get1);
            System.out.println(formatDuration(get2));
        }
    }

    public static String formatDuration(int seconds) {
        // your code goes here
        if (seconds == 0) {
            return "now";
        }
        String finalReadHrs = "";
        // if seconds still < 60
        if (seconds < 60) {
            finalReadHrs = scndMethod(seconds);
        } else if (seconds < 3600) {
            finalReadHrs = mntMethod(seconds);
        } else if (seconds < 86400) {
            finalReadHrs = hrsMethod(seconds);
        } else if (seconds < 31536000) {
            finalReadHrs = daysMthod(seconds);
        } else {
            finalReadHrs = yearsMethod(seconds);
        }
        return finalReadHrs;
    }

    // method for second
    public static String scndMethod(int seconds) {
        String retSec = "";
        if (seconds == 1) {
            retSec = "1 second";
        } else {
            retSec = seconds + " seconds";
        }
        return retSec;
    }

    // method for minutes
    public static String mntMethod(int seconds) {
        String retMnt = "";
        if (seconds == 60) {
            retMnt = "1 minute";
        } else if (seconds == 61) {
            retMnt = "1 minute and 1 second";
        } else {
            for (int i = 0; i < 2; i++) {
                if (i == 1) {
                    String newSec = (seconds == 1 || seconds == 0) ? " and " + seconds + " second"
                            : " and " + seconds + " seconds";
                    // retMnt = retMnt + " and " + seconds + " seconds";
                    retMnt = retMnt + newSec;
                } else {
                    String forMinutes = seconds / 60 == 1 ? "1 minute" : ((seconds / 60) + " minutes");
                    retMnt = forMinutes;
                }
                seconds = seconds % 60;
                if (seconds == 0) {
                    break;
                }
            }
        }
        return retMnt;
    }

    // method for hours
    public static String hrsMethod(int seconds) {
        String finalHours = "";
        if (seconds == 3600) {
            return "1 hour";
        } else {
            String forHour = seconds / 3600 == 1 ? "1 hour" : ((seconds / 3600) + " hours");
            finalHours = forHour;
            seconds = seconds % 3600;
            if (seconds == 0) {
                return finalHours;
            } else if (seconds > 0 && seconds < 60) {
                String tailSecond = (seconds == 1) ? " second" : " seconds";
                return finalHours + ", 0 minute and " + seconds + tailSecond;
            } else {
                String forMinute = mntMethod(seconds);
                String[] convStr = forMinute.split(" ");
                if (convStr.length == 2) {
                    finalHours = finalHours + " and " + forMinute;
                } else {
                    finalHours = finalHours + ", " + mntMethod(seconds);
                }
            }
        }
        return finalHours;
    }

    // method for days
    public static String daysMthod(int seconds) {
        String finalDays = "";
        if (seconds == 86400) {
            return "1 day";
        } else {
            String forDay = seconds / 86400 == 1 ? "1 day" : ((seconds / 86400) + " days");
            finalDays = forDay;
            seconds = seconds % 86400;
            if (seconds == 0) {
                return finalDays;
            } else {
                String forHour = hrsMethod(seconds);
                String[] convStr = forHour.split(" ");
                if (convStr.length == 2) {
                    finalDays = finalDays + " and " + forHour;
                } else {
                    System.out.println("new = " + forHour);
                    finalDays = finalDays + ", " + hrsMethod(seconds);
                }
            }
        }
        return finalDays;
    }

    // method for years
    public static String yearsMethod(int seconds) {
        String finalYears = "";
        if (seconds == 31536000) {
            return "1 year";
        } else {
            String forYear = seconds / 31536000 == 1 ? "1 year" : ((seconds / 31536000) + " years");
            finalYears = forYear;
            seconds = seconds % 31536000;
            if (seconds == 0) {
                return finalYears;
            } else {
                String forDays = daysMthod(seconds);
                String[] conv = forDays.split(" ");
                if (conv.length == 2) {
                    finalYears = finalYears + " and " + forDays;
                } else {
                    finalYears = finalYears + ", " + daysMthod(seconds);
                }
            }
        }
        return finalYears;
    }

}
