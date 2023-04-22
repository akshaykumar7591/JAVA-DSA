package CH14_Sliding_Window;

import java.util.Scanner;

public class largest_subarray_of_sum_K {
    public static void largestsum(int arr[] ,int k){
        int sum=0;
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        while(j<arr.length){
            sum+=arr[j];
            if(sum<k){
                j++;
            }
            else if(sum==k){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(sum>k){
                while(sum>k){
                    sum-=arr[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();

        }

        System.out.println("enter sum");
        int k=sc.nextInt();
        largestsum(arr,k);

    }
}
