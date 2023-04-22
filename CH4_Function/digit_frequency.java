package CH4_Function;

import java.util.Scanner;

public class digit_frequency {
    public static int digit(int num,int d){
        int count=0;
        while(num>0){
            int rev=num%10;
           num= num/10;
           if(rev==d)
               count++;

        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fre= sc.nextInt();
        System.out.println(digit(num,fre));
    }
}
