package CH10_Binary_Search;

import java.util.Scanner;

public class find_ele_in_sorted_infinte_Array {
    public static void ans(int arr[],int target){
        int st=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-st+1)*2;
            st=temp;
        }
        System.out.println(binary(arr,target,st,end));
    }
    public static boolean binary(int arr[],int target,int st,int end){
        while(st<=end){
            int mid =st+(end-st)/2;
            if(target==arr[mid]){
                return true;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        ans(arr,target);
    }
}
