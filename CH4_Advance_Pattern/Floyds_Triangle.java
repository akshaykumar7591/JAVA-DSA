package CH4_Advance_Pattern;

import java.util.Scanner;

public class Floyds_Triangle {
    public static void triangle(int n){
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        triangle(num);
    }
}
