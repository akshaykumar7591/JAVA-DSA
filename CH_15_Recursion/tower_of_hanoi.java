package CH_15_Recursion;

import java.util.Scanner;

public class tower_of_hanoi {
    public static void printstep(int n, String s ,String h , String d){
        if(n==0){
            return;
        }
        printstep(n-1,s,d,h);
        System.out.println("move "+n+"th disc from "+s+" to "+d);
        printstep(n-1,h,s,d);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printstep(n,"src","help","destination");
    }
}
