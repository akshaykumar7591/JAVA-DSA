package CH_15_Recursion;

import java.util.Scanner;

public class tiling_Problem {
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=tilingProblem(n-1);
        int fnm2=tilingProblem(n-2);
        return fnm2+fnm1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(tilingProblem(n));
    }
}
