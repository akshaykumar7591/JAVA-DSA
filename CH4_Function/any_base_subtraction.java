package CH4_Function;

import java.util.Scanner;

public class any_base_subtraction {
    public static int getsub(int num,int num1,int base){
        int ans=0;
        int pw=1;
        int carry =0;
        while(num>0 || num1>0||carry>0){
            int d=num%10;
            int d1=num1%10;
            num/=10;
            num1/=10;
           int digit=0;
           d1=d1+carry;
           if(d1>=d){  // we subtract from num1-num
               carry=0;
               digit=d1-d;
           }
           else{
               carry=-1;
               digit=d1+base-d;

           }
           ans+=digit*pw;
           pw*=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num 1 : ");
        int num=sc.nextInt();
        System.out.println("enter num 2 and greater than num1 : ");
        int num1=sc.nextInt();
        System.out.println("enter base int which subtract");
        int base=sc.nextInt();
        System.out.println(getsub(num,num1,base));
    }
}
