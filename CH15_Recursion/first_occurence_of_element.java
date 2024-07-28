package CH_15_Recursion;

import java.util.Scanner;

public class first_occurence_of_element {
    public static int firstOccurence(int arr[],int n,int target,int idx){
        if(idx==n){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        return firstOccurence(arr,n,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(firstOccurence(arr,n,target,0));
    }
}
