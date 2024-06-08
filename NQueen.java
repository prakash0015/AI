package Aiexam;
package AI;
public class NQueen {
    public static void main(String[] args) {
        int n = 4;    //nxn chess board  and n no. of queens
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j] = 'X';
            }
        }

        queens(board,0);
    }

    private static void queens(char[][] board, int row) {
       int n = board.length;
       if(row==n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return;
       }

       for(int j=0;j<n;j++) {  // here j indicating columns
        if(isSave(board,row,j)) {
            board[row][j] = 'Q';
            queens(board, row+1);
            board[row][j] = 'X';  //backtracking
        }
       }
       return;
    }


    //checking all possible move of queen
    private static boolean isSave(char[][] board, int row, int col) {
        int n = board.length;
        //check row
        for(int j=0;j<n;j++) {
            if(board[row][j] == 'Q') return false;
        }

        //check column
        for(int i=0;i<n;i++) {
            if(board[i][col] == 'Q') return false;
        }

        //check north west
        int i = row;
        int j = col;
        while(i>=0 && j>=0) {
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }

        //north east
        i = row;
        j = col;
        while(i>=0 && j<n) {
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }

        //south east
        i = row;
        j = col;
        while(i>=0 && j>=0) {
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }

        //south west
        i = row;
        j = col;
        while (i<n && j>=0) {
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }
        return true;


    }
}
