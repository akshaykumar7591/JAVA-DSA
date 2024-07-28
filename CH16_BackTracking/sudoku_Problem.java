package CH_16_BackTracking;

import java.util.Scanner;

public class sudoku_Problem {
    public static void sudukoSolver(int [][] board,int row,int col){
        if(col==9){
            row++;
            col=0;

        }
        if(row==9){
            System.out.println("found");
            display(board);
            return;
        }
        if(board[row][col]!=0){
            sudukoSolver(board,row,col+1);
        }
       else{
           for(int i=1;i<=9;i++){
               if(isitPossible(board,row,col,i)==true){
                   board[row][col]=i;
                   sudukoSolver(board,row,col+1);
                   board[row][col]=0;
               }
           }
        }
    }

    private static boolean isitPossible(int [][] board, int row, int col,int val) {
        //row
        int c=0;
        while(c<9){
            if(board[row][c]==val){
                return false;
            }
            c++;
        }
        //col
        int r=0;

        while(r<9){
            if(board[r][col]==val){
                return false;
            }
            r++;

        }
        // 3*3matrix
        r=row-row%3;
        c=col-col%3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]==val){
                    return false;
                }

            }
        }
        return true;
    }

    private static void display(int [][] ans) {
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

        int  [][]board={{5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}};
        sudukoSolver(board,0,0);
    }
}
