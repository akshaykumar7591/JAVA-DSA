package CH_15_Recursion;

import java.util.Scanner;

public class coin_Toss {
    public static void coinToss(int n,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        coinToss(n-1,str+"H");
        coinToss(n-1,str+"T");

    }
    // without cosecutive Head
    public static void coinToss1(int n,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(str.length()==0|| str.charAt(str.length()-1)!='H') {
            coinToss1(n - 1, str + "H");
        }
        coinToss1(n-1,str+"T");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        coinToss(n,"");
        System.out.println("not print consecutive Head");
        coinToss1(n,"");
    }
}
