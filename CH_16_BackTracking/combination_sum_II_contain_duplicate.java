package CH_16_BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class combination_sum_II_contain_duplicate {
    public static void printpermutation(int []coin, int amount, List<Integer> list,int idx, List<List<Integer>> ans1){
        if(amount==0){
            ans1.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<coin.length;i++){
            if(i!=idx && coin[i]==coin[i-1]){
                continue;
            }
            if(amount>=coin[i]){
                list.add(coin[i]);
                printpermutation(coin,amount-coin[i],list,i+1,ans1);
                list.remove(list.size()-1);
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
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(coin);
        printpermutation(coin,amount,list,0,ans);
        System.out.println(ans);
    }
}
