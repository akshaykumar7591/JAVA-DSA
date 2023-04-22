package CH5_Arrays;

import java.util.Scanner;

public class Max_subArray_prefix_Method {
    public static int[] prefix(int arr[]){
        int prefix1[]=new int[arr.length];
        prefix1[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix1[i]=arr[i]+prefix1[i-1];
        }
        return prefix1;
    }
    public static void subarray(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int prefix1[]=prefix(arr);

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                if(i>0) {
                    sum = prefix1[j] - prefix1[i - 1];
                }
                else{
                    sum=prefix1[j];
                }
                if(sum>max){
                    max=sum;
                }


            }

        }
        System.out.println("max of subarray is: "+max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        subarray(arr);
    }
}



