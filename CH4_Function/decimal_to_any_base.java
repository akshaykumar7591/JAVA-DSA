package CH4_Function;

import java.util.Scanner;

public class decimal_to_any_base {
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int base=sc.nextInt();
        System.out.println(valueINBase(num,base));
    }
}
