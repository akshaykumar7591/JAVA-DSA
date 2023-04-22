package CH5_Arrays;

import java.util.Scanner;

public class largest_in_array {
    public static int largestInArray(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
       int ans= largestInArray(arr);
        System.out.println("max element in array is : "+ans);
    }
}
