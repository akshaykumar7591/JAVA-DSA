package CH_16_BackTracking;

import java.util.Scanner;

public class coin_combination {
    public static void printcombination(int []coin,int amount,String ans,int idx){
        if(amount==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=idx;i<coin.length;i++){
            if(amount>=coin[i]){
                printcombination(coin,amount-coin[i],ans+coin[i],i);
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
        printcombination(coin,amount,"",0);
    }
}
