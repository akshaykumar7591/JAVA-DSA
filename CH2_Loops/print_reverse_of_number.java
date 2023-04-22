package CH2_Loops;

import java.util.Scanner;

public class print_reverse_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=(rev*10)+rem;
            num/=10;
        }
        System.out.println("revers number is :"+rev);
    }
}
