package ru.geekbrains.seminars.seminars.Seminar2.HomeWork;

public class Ex4 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println("Validate:" + isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++){
            for(int col = 0;col < 8; col++){
                if(board[row][col] == board[row][col + 1]){
                    return false;
                }
            }
        }

        for(int col2 = 0;col2 < 9; col2++){
            for(int row2 = 0;row2 < 8;row2++){
                if (board[row2][col2] == board[row2 +1 ][col2]){
                    return false;
                }
            }
        }

        for(int row = 0; row < 9; row += 3){
            for(int col = 0; col < 9; col += 3){
                for(int pos = 0; pos < 8; pos++){
                    for(int pos2 = pos + 1; pos2 < 9; pos2++){
                        if(board[row + pos % 3][col + pos / 3] == board[row + pos2 % 3][col + pos2 / 3]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
