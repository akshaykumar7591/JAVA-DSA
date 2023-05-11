package CH_16_BackTracking;

import java.util.Scanner;

public class arrange_queen_in_board_Permutation {
    public static void Queen(boolean []board,int tq,int qpsf,String ans){
        if(tq==qpsf){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                Queen(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
                board[i]=false;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int queen=sc.nextInt();
        int size=sc.nextInt();
        boolean []board=new boolean[size];
        Queen(board,queen,0,"");
    }
}
