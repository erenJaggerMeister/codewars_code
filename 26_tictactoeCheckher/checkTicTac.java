import java.util.*;

public class checkTicTac {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] board1 = { { 0, 0, 1 }, { 0, 1, 2 }, { 2, 1, 0 } };
        int[][] board2 = { { 1, 1, 1 }, { 0, 2, 2 }, { 0, 0, 0 } };
        int[][] board3 = { { 1, 1, 2 }, { 0, 2, 0 }, { 2, 1, 1 } };
        int[][] board4 = { { 1, 2, 1 }, { 1, 1, 2 }, { 2, 1, 2 } };
        int[][] board5 = { { 1, 0, 2 }, { 0, 0, 2 }, { 1, 0, 2 } };
        System.out.println(isSolved(board1));
        System.out.println(isSolved(board2));
        System.out.println(isSolved(board3));
        System.out.println(isSolved(board4));
        System.out.println(isSolved(board5));
    }

    public static int isSolved(int[][] board) {
        // your code here
        // check row
        // for (int i = 0; i < 3; i++) {
        // if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
        // return board[i][0];
        // }
        // }
        // // check column
        // for (int j = 0; j < 3; j++) {
        // if (board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
        // return board[0][j];
        // }
        // }
        // // diagonal
        // if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
        // return board[0][0];
        // }
        // if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
        // return board[2][0];
        // }
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // if (board[i][j] == 0) {
        // return -1;
        // }
        // }
        // }
        // return 0;
        // Check row
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != 0) {
                return board[i][0];
            }
        }

        // Check column
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != 0) {
                return board[0][j];
            }
        }

        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0) {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0) {
            return board[0][2];
        }

        // Check for a draw
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return -1; // Game is still ongoing
                }
            }
        }

        return 0; // It's a draw
    }
}
