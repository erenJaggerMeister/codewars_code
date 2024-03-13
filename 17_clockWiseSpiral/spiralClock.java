import java.util.*;

public class spiralClock {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int besarArray = sc.nextInt();
        int[][] tempArr = createSpiral(besarArray);
        for (int i = 0; i < tempArr.length; i++) {
            for (int j = 0; j < tempArr[0].length; j++) {
                System.out.print(tempArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createSpiral(int N) {
        // your code here
        int numberCounter = 1;
        int[][] clockWiseArr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                clockWiseArr[i][j] = -1;
            }
        }
        int rowsIndex = 0;
        int columnIndex = 0;
        boolean upMove = false;
        boolean downMove = false;
        boolean rightMove = true;
        boolean leftMove = false;
        while (upMove == true || downMove == true || rightMove == true || leftMove == true) {
            clockWiseArr[rowsIndex][columnIndex] = numberCounter;
            numberCounter++;
            if (rightMove == true) {
                if (columnIndex <= N - 1) {
                    if (clockWiseArr[rowsIndex][columnIndex + 1] == -1 && (columnIndex + 1) <= N - 1) {
                        columnIndex++;
                    } else {
                        rightMove = false;
                        if (clockWiseArr[rowsIndex + 1][columnIndex] != -1) {
                            break;
                        }
                        downMove = true;
                        rowsIndex++;
                    }
                } else {
                    rightMove = false;
                    if (clockWiseArr[rowsIndex + 1][columnIndex] != -1) {
                        break;
                    }
                    downMove = true;
                    rowsIndex++;
                }
            }
            if (downMove == true) {
                if (rowsIndex < N) {
                    if (clockWiseArr[rowsIndex + 1][columnIndex] == -1) {
                        rowsIndex++;
                    } else {
                        downMove = false;
                        if (clockWiseArr[rowsIndex][columnIndex - 1] != -1) {
                            break;
                        }
                        leftMove = true;
                        columnIndex--;
                    }
                } else {
                    downMove = false;
                    if (clockWiseArr[rowsIndex][columnIndex - 1] != -1) {
                        break;
                    }
                    leftMove = true;
                    columnIndex--;
                }
            }
            if (leftMove == true) {
                if (columnIndex >= 0) {
                    if (clockWiseArr[rowsIndex][columnIndex - 1] == -1) {
                        columnIndex--;
                    } else {
                        leftMove = false;
                        if (clockWiseArr[rowsIndex - 1][columnIndex] != -1) {
                            break;
                        }
                        upMove = true;
                        rowsIndex--;
                    }
                } else {
                    leftMove = false;
                    if (clockWiseArr[rowsIndex - 1][columnIndex] != -1) {
                        break;
                    }
                    upMove = true;
                    rowsIndex--;
                }
            }
            if (upMove == true) {
                if (rowsIndex >= 0) {
                    if (clockWiseArr[rowsIndex - 1][columnIndex] == -1) {
                        rowsIndex--;
                    } else {
                        upMove = false;
                        if (clockWiseArr[rowsIndex][columnIndex + 1] != -1) {
                            break;
                        }
                        rightMove = true;
                        columnIndex++;
                    }
                } else {
                    upMove = false;
                    if (clockWiseArr[rowsIndex][columnIndex + 1] != -1) {
                        break;
                    }
                    rightMove = true;
                    columnIndex++;
                }
            }
        }
        return clockWiseArr;
    }
}
