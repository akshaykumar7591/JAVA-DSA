package CH4_Function;

import java.util.Scanner;

public class any_base_to_any_base {
    public static int valueINBase(int num , int base){
        int ans=0;
        int p=1;
        while(num>0){
            int rev=num%base;
            ans=ans+ rev*p;
            num=num/base;
            p*=10;


        }
        return ans;
    }
    public static int valueInDecimal(int num ,int base){
        int ans=0;
        int  pw=1;
        while(num>0){
            int rev=num%10;
            num=num/10;
            ans+=rev*pw;
            pw*=base;

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int base=sc.nextInt();
        int ans=valueInDecimal(num,base);
        int base1=sc.nextInt();
        System.out.println(valueINBase(ans,base1));

    }
}
