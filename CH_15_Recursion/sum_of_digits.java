package CH_15_Recursion;

import java.util.Scanner;

public class sum_of_digits {
    public static int sumOfDigits(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return sumOfDigits(n/10)+n%10;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumOfDigits(n));
    }
}
