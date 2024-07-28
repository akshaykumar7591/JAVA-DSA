package CH_15_Recursion;

import java.util.Scanner;

public class print_all_possible_way_off_jump {
    public static int boaedPAth(int end,int curr,String ans){
        if(end==curr){
            System.out.println(ans);
            return 1;
        }
        if(curr>end){
            return 0;
        }
//        int p1=boaedPAth(end,curr+1,ans+1);
//        int p2=boaedPAth(end,curr+2,ans+2);
//        int p3=boaedPAth(end,curr+3,ans+3);
//
//        return p1+p2+p3;

        // better way to write
        int count=0;
        for(int i=1;i<=3;i++){
            count+=boaedPAth(end,curr+i,ans+i);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(boaedPAth(n,0,""));
    }
}
