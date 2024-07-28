package CH_15_Recursion;

import java.util.Scanner;

public class print_natural_number_in_reverse {
    public static void naturalNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        naturalNumber(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        int n=sc.nextInt();
        naturalNumber(n);
    }
}
