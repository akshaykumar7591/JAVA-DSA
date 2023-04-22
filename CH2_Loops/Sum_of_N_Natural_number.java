package CH2_Loops;

import java.util.Scanner;

public class Sum_of_N_Natural_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("sum is :"+sum);
    }
}
