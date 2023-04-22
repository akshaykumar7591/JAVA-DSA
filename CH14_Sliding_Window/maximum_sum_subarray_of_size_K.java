package CH14_Sliding_Window;

import java.util.Scanner;

public class maximum_sum_subarray_of_size_K {
    public static void maxsum(int[] arr,int k){
        int n=arr.length;
        int i=0;
        int j=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(j<n){
            sum+=arr[j];
//            System.out.println(sum);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max=Math.max(max,sum);
                sum=sum-arr[i];
//                System.out.println(sum);
                i++;
                j++;
            }

        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("size of subarray");
        int k=sc.nextInt();
        maxsum(arr,k);
    }
}
