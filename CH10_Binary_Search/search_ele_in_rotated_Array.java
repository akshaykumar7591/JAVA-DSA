package CH10_Binary_Search;

import java.util.Scanner;
// in this question element is distinct so find index of target element
public class search_ele_in_rotated_Array {
    public static int search(int arr[],int n,int target){
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(arr[mid]<arr[n-1]){
                if(target>arr[mid] && target <=arr[n-1]){
                    st=mid-1;
                }

            }
            else{
                if(target<arr[mid] && target >=arr[n-1]){
                    end=mid+1;
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
