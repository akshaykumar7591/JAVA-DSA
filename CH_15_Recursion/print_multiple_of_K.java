package CH_15_Recursion;

import java.util.Scanner;

public class print_multiple_of_K {
    public static void printMultiple(int num, int k){
        if(k==0){
            return;
        }
        printMultiple(num,k-1);
        System.out.print(num*k+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int k=sc.nextInt();
        printMultiple(num,k);
    }
}
