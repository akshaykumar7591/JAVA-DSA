package CH_15_Recursion;

import java.util.Scanner;

public class fibbonacci_number {
    public static int fibbonic(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibbonic(n-1)+fibbonic(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // only for print nth element
        System.out.println(fibbonic(n));

        // if print 0 to nth element then
        for (int i=0;i<=n;i++){
            System.out.print(fibbonic(i)+" ");
        }
    }
}
