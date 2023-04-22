package CH4_Advance_Pattern;

import java.util.Scanner;

public class Print_Hallow_rectangle {
    public static void rectangle(int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||i==row-1||j==0||j==col-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        rectangle(row,col);
    }
}
