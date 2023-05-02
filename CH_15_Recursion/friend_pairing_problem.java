package CH_15_Recursion;

import java.util.Scanner;

public class friend_pairing_problem {
    public static int friendpairing(int n){
        if(n==1 || n==2){
            return n;
        }
        int fm1=friendpairing(n-1);
        int fm2=friendpairing(n-2);
        int pairWays=(n-1)*fm2;

        return fm1+pairWays;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(friendpairing(n));
    }
}
