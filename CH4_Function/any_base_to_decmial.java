package CH4_Function;

import java.util.Scanner;

public class any_base_to_decmial {
    public static int valueIndecimal(int num ,int base){
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
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int base=sc.nextInt();
        System.out.println(valueIndecimal(num,base));
    }
}
