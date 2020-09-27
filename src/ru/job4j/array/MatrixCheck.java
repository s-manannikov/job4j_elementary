package ru.job4j.array;

    public class MatrixCheck {
        public static boolean monoHorizontal(char[][] board, int row) {
            boolean result = true;
            for (int i = 0; i < board.length; i++) {
                if (board[row][i] != 'X') {
                    result = false;
                    break;
                }
            }
            return result;
        }

        public static boolean monoVertical(char[][] board, int column) {
            boolean result = true;
            for (int j = 0; j < board.length; j++) {
                if (board[j][column] != 'X') {
                    result = false;
                    break;
                }
            }
            return result;
        }

        public static char[] extractDiagonal(char[][] board) {
            char[] result = new char[board.length];
            for (int k = 0; k < board.length; k++) {
                result[k] = board[k][k];
            }
            return result;
        }

        public static boolean isWin(char[][] board) {
            boolean result = false;
            for (int l = 0; l < board.length; l++) {
                if ((monoHorizontal(board, l)) || monoVertical(board, l)) {
                    result = true;
                    break;
                }
            }
            return result;
        }
    }




