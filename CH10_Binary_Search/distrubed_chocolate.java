package CH10_Binary_Search;

import java.util.Scanner;

public class distrubed_chocolate {
    public static boolean isDividionPossible(int arr[],int mid,int member){
        int numofstudent=1;
        int cho=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid){
                return false;

            }
            if(arr[i]+cho<=mid){
                cho+=arr[i];
            }
            else{
                numofstudent++;
                cho=arr[i];
            }
        }
        if(numofstudent>member){
            return false;
        }
        else{
            return true;
        }
    }
    public static int  distribution(int arr[],int member){
        int ans=0;
        int st=1;
        int end=(int)1e9;
        if(arr.length<member) return -1;
        while(st<=end){
            int mid =st+(end-st)/2;
            if(isDividionPossible(arr,mid,member)){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number of student among which choclate distribute : ");
        int member=sc.nextInt();
        System.out.println(distribution(arr,member));
    }
}
