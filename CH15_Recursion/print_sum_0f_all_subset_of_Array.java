package CH_15_Recursion;

import java.util.Scanner;

public class print_sum_0f_all_subset_of_Array {
    public static void subsetSum(int arr[],int n,int idx ,int sum){
        if(idx==n){
            System.out.println(sum);
            return;
        }
        subsetSum(arr,n,idx+1,sum+arr[idx]);
        subsetSum(arr,n,idx+1,sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        subsetSum(arr,n,0,0);
    }
}
