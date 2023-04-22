package CH5_Arrays;

import java.util.Scanner;
// this is used for find the max sum of subarray

public class Kadanes_Algorithm {
    public static void kardan(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            max=Math.max(sum,max);
        }
        System.out.println("max nuber is :"+max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        kardan(arr);
    }
}
