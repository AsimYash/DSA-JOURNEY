class Solution {
    public boolean validTicTacToe(String[] board) {
        int x = 0;
        int o = 0;
        for (String row : board) {
            for (char c : row.toCharArray()){
                if (c == 'X')
                x++;
                else if (c == 'O')
                o++;
            }
        }
        if (x < o || x > o + 1)
        return false;
        boolean xWin = win(board, 'X');
        boolean oWin = win(board, 'O');
        if (xWin && oWin)
        return false;
        if (xWin && x != o + 1)
        return false;
        if (oWin && x != o)
        return false;
        return true;
    }
    private boolean win(String[] board, char ch) {
        for (int i = 0; i < 3; i++){
            if (board[i].charAt(0) == ch &&
                board[i].charAt(1) == ch &&
                board[i].charAt(2) == ch)
            return true;
            if (board[0].charAt(i) == ch &&
                board[1].charAt(i) == ch &&
                board[2].charAt(i) == ch)
            return true;
        }
        if (board[0].charAt(0) == ch &&
            board[1].charAt(1) == ch &&
            board[2].charAt(2) == ch)
        return true;
        if (board[0].charAt(2) == ch &&
            board[1].charAt(1) == ch &&
            board[2].charAt(0) == ch)
        return true;
        return false;
    }
}
