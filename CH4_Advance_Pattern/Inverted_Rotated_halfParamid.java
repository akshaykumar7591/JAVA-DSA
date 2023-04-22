package CH4_Advance_Pattern;

import java.util.Scanner;


public class Inverted_Rotated_halfParamid {
    public static void paramid(int num){
        for(int i=0;i<num;i++){
            for(int j=num-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        paramid(num);
    }
}
