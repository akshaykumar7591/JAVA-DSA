package CH4_Function;

import java.util.Scanner;

public class Any_base_addition {
    public static int getsum(int num,int num1,int base){
        int ans=0;
        int pw=1;
        int carry =0;
        while(num>0 || num1>0||carry>0){
            int d=num%10;
            int d1=num1%10;
            num/=10;
            num1/=10;
            int digit=d+d1 +carry; // important point carry
            carry=digit/base;
            digit=digit%base;
            ans+=digit*pw;
            pw*=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num 1");
        int num=sc.nextInt();
        System.out.println("enter num 2");
        int num1=sc.nextInt();
        System.out.println("enter base int which add");
        int base=sc.nextInt();
        System.out.println(getsum(num,num1,base));
    }
}
