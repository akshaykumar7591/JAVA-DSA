package CH4_Advance_Pattern;

import java.util.Scanner;

public class Diamond_pattern {
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*(i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*(i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        diamond(num);
    }
}
