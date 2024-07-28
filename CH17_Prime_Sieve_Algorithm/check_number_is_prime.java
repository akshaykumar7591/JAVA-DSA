package CH_17_Prime_Sieve_Algorithm;

import java.util.Scanner;

public class check_number_is_prime {
    public static boolean isPrime(int n){
        int div=2;
        while(div*div<=n){
            if(n%div==0){
                return false;
            }
            div++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=2;i<=n;i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }
        }
    }

}
