package CH10_Binary_Search;

import java.util.Scanner;
// find the index of minimum element in array where array is ratated

public class search_min_ele_rotated_array {
    public static int search(int arr[],int n){
        int st=0;
        int end=n-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<=arr[n-1]){
                ans=mid;
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int idx= search(arr,n);
        System.out.println(idx);
    }
}

