package CH11_Linear_Search;

import java.util.Scanner;

public class search_in_2D_array {
    public static int[] search(int[][] arr,int n,int d){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==d){
                    return new int[]{i,j}; // new things

                }
            }
        }
        return new int[]{-1,-1};
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
        int d=sc.nextInt();
        int arr2[]=search(arr,n,d);
        for(int val : arr2){
            System.out.print(val+" ");
        }

    }
}
