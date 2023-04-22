package CH3_Patterns;

import java.util.Scanner;

public class Print_all_Primes_in_a_range {
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }

        }
        return true;
    }
    public static void printInrange(int num){
        for(int i=2;i<=num;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printInrange(num);
    }
}
