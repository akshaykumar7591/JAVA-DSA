package CH10_Binary_Search;

import java.util.Scanner;

public class peak_index_in_moutain_array {
    public static void peakele(int[] arr,int n){
        int ans=-1;
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid =st+(end-st)/2;
            if(arr[mid]<arr[mid+1]){
                ans=mid+1;
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(arr[ans]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        peakele(arr,n);
    }
}
