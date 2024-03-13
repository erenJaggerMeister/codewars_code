import java.util.*;

public class snail {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] tester1 = new int[3][3];
        int counter = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tester1[i][j] = counter;
                counter++;
            }
        }
        for (int i = 0; i < tester1.length; i++) {
            for (int j = 0; j < tester1[0].length; j++) {
                System.out.print(tester1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("coba print snail");
        boolean kanan = true;
        boolean bawah = false;
        boolean kiri = false;
        boolean atas = false;
        int indexRow = 0;
        int indexColumn = 0;
        int totalItr = 9;
        for (int x = 0; x < totalItr; x++) {
            System.out.println("[" + indexRow + "]" + "[" + indexColumn + "]");
            System.out.println(tester1[indexRow][indexColumn]);
            tester1[indexRow][indexColumn] = -1;
            if (indexColumn + 1 < tester1[0].length && tester1[indexRow][indexColumn + 1] != -1) {
                indexColumn++;
            } else if (indexRow + 1 < tester1.length && tester1[indexRow + 1][indexColumn] != -1) {
                indexRow++;
            } else if (indexColumn - 1 >= 0 && tester1[indexRow][indexColumn - 1] != -1) {
                indexColumn--;
            } else if (indexRow - 1 >= 0 && tester1[indexRow - 1][indexColumn] != -1) {
                indexRow--;
            }

            // // cek pada saat kondisi index mentok
            // // atas tidak mungkin 0 karena di cek tidak akan sampai index = 0
            // // jika di cek ke kanan
            // if (indexColumn == 2 && kanan == true) {
            // kanan = false;
            // bawah = true;
            // indexRow++;
            // }
            // // jika di cek ke bawah
            // if (indexRow == 2 && bawah == true) {
            // bawah = false;
            // kiri = true;
            // indexColumn--;
            // }
            // // jika di cek ke kiri
            // if (indexColumn == 0 && kiri == true) {
            // kiri = false;
            // atas = true;
            // indexRow--;
            // }
            // // bagian cek untuk yang indexnya bukan mentok
            // // dari atas ke kanan
            // if (tester1[indexRow - 1][indexColumn] == -1 && atas == true) {
            // atas = false;
            // kanan = true;
            // indexColumn++;
            // }
            // // cek ke atas terus
            // if (tester1[indexRow - 1][indexColumn] != -1 && atas == true) {
            // indexRow--;
            // }
            // // cek dari kanan ke bawah
            // if (tester1[indexRow][indexColumn + 1] == -1 && kanan == true) {
            // kanan = false;
            // bawah = true;
            // indexRow++;
            // }
            // // cek kanan terus
            // if (tester1[indexRow][indexColumn + 1] != -1 && kanan == true) {
            // indexColumn++;
            // }
            // // cek dari bawah ke kiri
            // if (tester1[indexRow + 1][indexColumn] == -1 && bawah == true) {
            // bawah = false;
            // kiri = true;
            // indexColumn--;
            // }
            // // cek bawah terus
            // if (tester1[indexRow + 1][indexColumn] != -1 && bawah == true) {
            // indexRow++;
            // }
            // // cek dari kiri ke atas
            // if (tester1[indexRow][indexColumn - 1] == -1 && kiri == true) {
            // kiri = false;
            // atas = true;
            // indexRow--;
            // }
            // // cek kiri terus
            // if (tester1[indexRow][indexColumn - 1] != -1 && kiri == true) {
            // indexColumn--;
            // }
        }

    }

    public static int[] snail(int[][] array) {
        // enjoy
        int[] finalResult = new int[array.length * array.length];
        LinkedList<Integer> tempSave = new LinkedList<Integer>();
        int indexRow = 0;
        int indexColumn = 0;
        for (int x = 0; x < array.length * array.length; x++) {
            tempSave.add(array[indexRow][indexColumn]);
            array[indexRow][indexColumn] = -1;
            if (indexColumn + 1 < array[0].length && array[indexRow][indexColumn + 1] != -1) {
                indexColumn++;
            } else if (indexRow + 1 < array.length && array[indexRow + 1][indexColumn] != -1) {
                indexRow++;
            } else if (indexColumn - 1 >= 0 && array[indexRow][indexColumn - 1] != -1) {
                indexColumn--;
            } else if (indexRow - 1 >= 0 && array[indexRow - 1][indexColumn] != -1) {
                indexRow--;
            }
        }
        for (int i = 0; i < tempSave.size(); i++) {
            finalResult[i] = tempSave.get(i);
        }
        return finalResult;
    }
}
