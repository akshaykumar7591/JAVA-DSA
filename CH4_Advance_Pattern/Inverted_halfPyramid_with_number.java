package CH4_Advance_Pattern;

import java.util.Scanner;

public class Inverted_halfPyramid_with_number {
    public static void numberPyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        numberPyramid( num);
    }
}
