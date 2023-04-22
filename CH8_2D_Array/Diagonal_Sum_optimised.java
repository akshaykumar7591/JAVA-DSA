package CH8_2D_Array;

import java.util.Scanner;

public class Diagonal_Sum_optimised {
    public static int diagonalSum(int arr[][]){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i!=n-i-1){
                sum+=arr[i][arr.length-1-i];
            }
        }
        return sum;
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
        int ans=diagonalSum(arr);
        System.out.println(ans);
    }
}
