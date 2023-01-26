package medium.validsudoku;

import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            List<Character> elList = new ArrayList<>();
            for (int col = 0; col < board[row].length; col++) {
                char e = board[row][col];
                if (e != '.') {
                    elList.add(e);
                }
            }
            if (elList.size() != new HashSet<>(elList).size()) {
                return false;
            }
        }

        for (int row = 0; row < board.length; row++) {
            List<Character> elList = new ArrayList<>();
            for (int col = 0; col < board[row].length; col++) {
                char e = board[col][row];
                if (e != '.') {
                    elList.add(e);
                }
            }
            if (elList.size() != new HashSet<>(elList).size()) {
                return false;
            }
        }

        for (int xmin = 0; xmin < 9; xmin = xmin + 3) {
            for (int ymin = 0; ymin < 9; ymin = ymin + 3) {
                List<Character> els = new ArrayList<>();
                addElement(board, xmin, 0, ymin, 0, els);
                addElement(board, xmin, 1, ymin, 0, els);
                addElement(board, xmin, 2, ymin, 0, els);
                addElement(board, xmin, 0, ymin, 1, els);
                addElement(board, xmin, 1, ymin, 1, els);
                addElement(board, xmin, 2, ymin, 1, els);
                addElement(board, xmin, 0, ymin, 2, els);
                addElement(board, xmin, 1, ymin, 2, els);
                addElement(board, xmin, 2, ymin, 2, els);

                if (els.size() != new HashSet<>(els).size()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void addElement(char[][] board, int xmin, int xinc, int ymin, int yinc, List<Character> els) {
        char e = board[xmin + xinc][ymin + yinc];
        if (e != '.') {
            els.add(e);
        }
    }

    public static void main(String[] args) {
        char[][] a =
                {{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '1', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(new Solution().isValidSudoku(a));
    }
}
