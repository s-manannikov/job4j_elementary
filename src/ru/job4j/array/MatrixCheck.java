package ru.job4j.array;

    public class MatrixCheck {
        public static boolean monoHorizontal(char[][] board, int row) {
            boolean result = true;
            for (int i = 0; i < board.length; i++) {
                if (board[row][i] != board[row][0]) {
                    result = false;
                    break;
                }
            }
            return result;
    }

        public static boolean monoVertical(char[][] board, int column) {
            boolean result = true;
            for (int j = 0; j < board.length; j++) {
                if (board[j][column] != board[0][column]) {
                    result = false;
                    break;
                }
            }
            return result;
        }
}

