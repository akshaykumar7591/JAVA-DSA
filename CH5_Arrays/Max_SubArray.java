package CH5_Arrays;

import java.util.Scanner;

        import java.util.Scanner;

public class Max_SubArray {
    public static void subarray(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
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


