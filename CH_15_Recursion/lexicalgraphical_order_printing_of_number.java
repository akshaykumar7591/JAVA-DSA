package CH_15_Recursion;

import java.util.Scanner;

public class lexicalgraphical_order_printing_of_number {
    public static void printcount(int curr,int end){
        if(curr>end){
            return;
        }
        System.out.print(curr+" ");
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            printcount(curr*10+i,end);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int end=sc.nextInt();
        printcount(0,end);
    }
}
