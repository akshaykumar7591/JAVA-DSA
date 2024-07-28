package CH_15_Recursion;

import java.util.Scanner;

public class isArray_Sorted {
    public static boolean isSorted(int arr[],int n,int idx){
        if(idx==n-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return isSorted(arr,n,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(isSorted(arr,n,0));
    }
}
