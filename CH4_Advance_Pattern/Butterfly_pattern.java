package CH4_Advance_Pattern;

import java.util.Scanner;

public class Butterfly_pattern {
    public static void butterfly(int n){
        //1st Half
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0;k<2*(n-i)-2;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Half
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0;k<2*(n-i)-2;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        butterfly(num);
    }
}
