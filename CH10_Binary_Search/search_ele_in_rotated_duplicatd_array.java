package CH10_Binary_Search;

import java.util.Scanner;

public class search_ele_in_rotated_duplicatd_array {
    public static int search(int arr[],int n,int target){
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target==arr[mid]){
                return mid;
            }
           else if(arr[st]==arr[mid] && arr[end]==arr[mid]){
               st++;
               end--;

            }
           else if(arr[mid]<=arr[end]){
               if(target>arr[mid] && target<=arr[end]){
                   st=mid+1;
               }
            }
           else{
                if(target<arr[mid] && target>=arr[st]){
                    end=mid-1;
                }
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int idx= search(arr,n,target);
        System.out.println(idx);
    }
}
