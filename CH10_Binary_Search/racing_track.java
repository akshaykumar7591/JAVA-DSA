package CH10_Binary_Search;

import java.util.Scanner;

public class racing_track {
    public static boolean isPossible(int arr[],int mid,int kid){
        int numofKid=1;
        int lastkid=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastkid>=mid){
                numofKid++;
                lastkid=arr[i];
            }
        }
        return numofKid>=kid;
    }
    public static int raceTrack(int arr[],int kid){
        int ans=-1;
        int st=1;
        int end=(int)1e9;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isPossible(arr,mid,kid)){
                ans=mid;
                st=mid+1;
            }
            else{
                end=mid-1;
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
        int kid=sc.nextInt();
        System.out.println(raceTrack(arr,kid));
    }
}
