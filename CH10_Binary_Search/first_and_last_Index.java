package CH10_Binary_Search;

import java.util.Scanner;

public class first_and_last_Index {
    public static void firstAndLastIndex(int [] arr,int n,int d){
        int st=0;
        int end=n-1;
        int first=0;
        int last=0;

        if(d>arr[n-1]){
            System.out.println("not found");
            return ;
        }
        // for first occurence
        while(st<=end){
            int mid=st+(end-st)/2;
            if(d==arr[mid]){
                first=mid;
                end=mid-1;
            }
            else if(d>arr[mid]){
               st=mid+1;
            }
            else{
                end=mid-1;

            }
        }
        st=0;
        end=n-1;
        // for last occurence
        while(st<=end){
            int mid=st+(end-st)/2;
            if(d==arr[mid]){
                last=mid;
                st=mid+1;
            }
            else if(d>arr[mid]){
                st=mid+1;
            }
            else{
                end=mid-1;

            }
        }
        System.out.println(" the first occurences is : "+first);
        System.out.println("the last occurences is  : "+last);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target : ");
        int d=sc.nextInt();
        firstAndLastIndex(arr,n,d);
    }
}
