package CH_16_BackTracking;

import java.util.Scanner;

public class coin_permutation {
    public static void printpermutation(int []coin,int amount,String ans){
        if(amount==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<coin.length;i++){
            if(amount>=coin[i]){
                printpermutation(coin,amount-coin[i],ans+coin[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []coin=new int[n];
        System.out.println("enter unique coin ");
        for(int i=0;i<n;i++){
            coin[i]=sc.nextInt();
        }

        System.out.println("enter amount");
        int amount=sc.nextInt();
        printpermutation(coin,amount,"");
    }
}
