package CH10_Binary_Search;

import java.util.Scanner;

public class search_ele_in_2D_array {
    public static boolean search(int[][] arr,int tar){
        int row=arr.length;
        int col=arr[0].length;
        int st=0;
        int end=col-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            // calculate element
            int midele=arr[mid/col][mid%col];
            if(tar==midele){
                    return true;
            }
            else if(tar>midele){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int tar=sc.nextInt();
        boolean arr2=search(arr,tar);
        System.out.println(arr2);

    }
}
