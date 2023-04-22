package CH8_2D_Array;

import java.util.Scanner;

public class Diagonal_Sum {
    public static int diagonalSum(int arr[][]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                else if(i+j==n-1){
                    sum+=arr[i][j];
                }
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
