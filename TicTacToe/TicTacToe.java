import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static char currentPlayerMark;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeBoard();
        currentPlayerMark = 'X';
        boolean gameFinished = false;

        while (!gameFinished) {
            printBoard();
            System.out.println("Player " + currentPlayerMark + " turn. Enter row (0-2) and column (0-2) separated by a space:");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board[row][col] == '-') {
                board[row][col] = currentPlayerMark;

                if (checkForWin()) {
                    gameFinished = true;
                    System.out.println("Congratulations, player " + currentPlayerMark + " wins!");
                } else if (checkForTie()) {
                    gameFinished = true;
                    System.out.println("It's a tie!");
                } else {
                    currentPlayerMark = (currentPlayerMark == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("This cell is already occupied. Try again.");
            }
        }
        scanner.close();
    }

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }

    private static boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonalsForWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2])) || (checkRowCol(board[0][2], board[1][1], board[2][0])));
    }

    private static boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    private static boolean checkForTie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
    }
}
        























