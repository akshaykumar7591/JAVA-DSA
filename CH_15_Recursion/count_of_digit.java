package CH_15_Recursion;

import java.util.Scanner;

public class count_of_digit {
    public static int countOfDigits(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        return countOfDigits(n/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countOfDigits(n));
    }
}
