package CH_15_Recursion;

import java.util.Scanner;

public class print_netural_number {
    public static void naturalNumber(int n){
        if(n==0){
            return;
        }
        naturalNumber(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        int n=sc.nextInt();
        naturalNumber(n);
    }
}
