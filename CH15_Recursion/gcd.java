package CH_15_Recursion;

import java.util.Scanner;

public class gcd {
    // brute force apporach
    public static int gcd1(int x,int y){
        int min=Math.min(x,y);
        for(int i=min;i>=1;i--){
            if ((x % i == 0) && (y % i == 0)) {
                return i;
            }
        }
        return 1;
    }

    // long divisor apporach
    public static int gcd2(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    // optimed apporach -- eculid algorithm
    public static int gcd3(int x,int y){
        if(y==0){
            return x;
        }
         return gcd3(y,x%y);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(gcd1(x,y));
        System.out.println(gcd2(x,y));

        // optimed apporach -- eculid algorithm
        System.out.println(gcd3(x,y));
    }
}
