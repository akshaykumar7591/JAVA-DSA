package CH_15_Recursion;

import java.util.Scanner;

public class print_zig_zag {
    public static void printzigzag(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        printzigzag(n-1);
        System.out.print(n);
        printzigzag(n-1);
        System.out.print(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printzigzag(n);
    }
}
