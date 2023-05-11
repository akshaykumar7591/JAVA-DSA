package CH_15_Recursion;

import java.util.Scanner;

public class maze_path {
    public static void printpath(int er,int ec,int cr,int cc,String ans){
        if(cc==ec && er==cr){
            System.out.print(ans+" ");
            return;
        }
        if(cc>ec || cr>ec){
            return;
        }
        printpath(er,ec,cr,cc+1,ans+"H");
        printpath(er,ec,cr+1,cc,ans+"V");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int er=sc.nextInt();
        int ec=sc.nextInt();
        printpath(er-1,ec-1,0,0,"");

    }
}
