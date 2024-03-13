import java.util.*;

public class enoughIsEnough {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int maxRepeat = 3;
        int[] numInput = { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 };
        // get max number
        if (numInput.length > 0) {
            int maxNumber = 0;
            for (int i = 0; i < numInput.length; i++) {
                if (numInput[i] > maxNumber) {
                    maxNumber = numInput[i];
                }
            }
            int[] newNumber = new int[maxNumber + 1];
            Arrays.fill(newNumber, 0);
            for (int i = 0; i < numInput.length; i++) {
                newNumber[numInput[i]]++;
                if (newNumber[numInput[i]] > maxRepeat) {
                    newNumber[numInput[i]]--;
                }
            }
            // array baru
            String getHasil = "";
            for (int i = 0; i < numInput.length; i++) {
                if (newNumber[numInput[i]] > 0) {
                    getHasil = getHasil + numInput[i] + ",";
                    newNumber[numInput[i]]--;
                }
            }
            String[] getTemp = getHasil.split(",");
            int[] newIntResult = new int[getTemp.length];
            for (int i = 0; i < getTemp.length; i++) {
                newIntResult[i] = Integer.parseInt(getTemp[i]);
            }
            // for (int i = 0; i < newIntResult.length; i++) {
            // System.out.print(newIntResult[i] + " ");
            // }
        }
    }
}