package CH_15_Recursion;

import java.util.Scanner;

public class frog_Jump {
    public static int bestWay(int arr[],int n,int idx){
        if(idx==n-1){
            return 0;
        }
        int op1=bestWay(arr,n,idx+1)+Math.abs(arr[idx+1]-arr[idx]);
        if(idx==n-2){
            return op1;
        }
        int op2=bestWay(arr,n,idx+2)+Math.abs(arr[idx+2]-arr[idx]);
        return Math.min(op1,op2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int ans= bestWay(arr,n,0);
        System.out.println(ans);
    }
}
