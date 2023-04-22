package CH5_Arrays;

import java.util.Scanner;

public class print_subarrays {
    public static void subarray(int arr[]){
        int n=arr.length;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    for(int k=i;k<=j;k++){
                        System.out.print( arr[k]+" " );
                    }
                    System.out.println();
                }
                System.out.println();
            }
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
