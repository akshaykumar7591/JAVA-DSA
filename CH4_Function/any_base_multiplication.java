package CH4_Function;

import java.util.Scanner;

public class any_base_multiplication {
    public static int getproduct(int num,int num1,int base){
        int ans=0;
        int p=1;
        while(num1>0){
            int d=num1%10;
            num1/=10;
            int pro=getproductInSigal(num,d,base);
            ans=getsum(ans,pro*p,base);
            p*=10;
        }
        return ans;

    }
    public static int getproductInSigal(int num,int d,int base){
        int ans=0;
        int p=1;
        int carry=0;
        while(num>0 || carry>0){
            int dig=num%10;
            num/=10;
            int d1=dig*d+carry;
            carry=d1/base;
            d1%=base;
            ans+=d1*p;
            p*=10;

        }
        return ans;
    }
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
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num1 : ");
        int num= sc.nextInt();
        System.out.println("enter num2 :  ");
        int num1=sc.nextInt();
        System.out.println("enter base in which we multiplication : ");
        int base=sc.nextInt();
        System.out.println(getproduct(num,num1,base));

    }
}
