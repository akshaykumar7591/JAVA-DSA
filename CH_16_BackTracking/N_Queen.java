package CH_16_BackTracking;

import java.util.Scanner;

public class N_Queen {
    public static void printpath(boolean [][] board,int row,int n){
        if(n==0){
            display(board);
            return;
        }
        if(row==board.length){
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isitPossible(board,row,col)==true){
                board[row][col]=true;
                printpath(board,row+1,n-1);
                board[row][col]=false;
            }
        }
    }

    private static boolean isitPossible(boolean[][] board, int row, int col) {
        //upper case
        int r=row;
        while(r>=0){
            if(board[r][col]==true){
                return false;
            }
            r--;
        }
        //left diagonal
        r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;

        }
        // right diagonal
        r=row;
        c=col;
        while(r>=0 && c<=board.length-1){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c++;

        }
        return true;
    }

    private static void display(boolean[][] ans) {
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean [][]board=new boolean[n][n];
        printpath(board,0,n);
    }
}
