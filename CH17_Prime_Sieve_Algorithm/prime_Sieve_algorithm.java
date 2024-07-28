package CH_17_Prime_Sieve_Algorithm;

import java.util.Scanner;

public class prime_Sieve_algorithm {
    public static void primesieve(int n){
        boolean [] prime=new boolean[n+1];
        prime[0]=true;
        prime[1]=true;
        for (int i=2;i*i<=n;i++){
            if(prime[i]==false){
                for (int mul=2;mul*i<=n;mul++){
                    prime[i*mul]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==false){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primesieve(n);
    }
}
