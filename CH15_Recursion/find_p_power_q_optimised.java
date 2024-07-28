package CH_15_Recursion;

import java.util.Scanner;

public class find_p_power_q_optimised {
    public static int power(int p,int q){
        if(q==0){
            return 1;
        }
        int smallpow=power(p,q/2);
        if(q%2==0){
            return smallpow*smallpow;
        }
        return p*smallpow*smallpow;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p=sc.nextInt();
        int q =sc.nextInt();
        System.out.println(power(p,q));
    }
}
