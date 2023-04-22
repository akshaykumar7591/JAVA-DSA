package CH8_2D_Array;

import java.util.Scanner;

public class sprialPrint {
    static void printArray(int arr3[][],int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void spiral(int arr[][],int n){
        int top=0,bottom=n-1,left=0,right=n-1;
        int total=0;
        while(total<n*n){
            //top ---left to right
            for(int i=left;i<=right && total<n*n;i++){
                System.out.print(arr[top][i]+" ");
                total++;
            }
            top++;
            //right --top bottom
            for(int i=top;i<=bottom && total<n*n;i++){
                System.out.print(arr[i][right]+" ");
                total++;
            }
            right--;
            //bottom right left

            for(int i=right;i>=left && total<n*n;i--){
                System.out.print(arr[bottom][i]+" ");
                total++;
            }
            bottom--;

            // left --bootom top
            for(int i=bottom;i>=top && total<n*n;i--){
                System.out.print(arr[i][left]+" ");
                total++;
            }
            left++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter size of matrix :");
        n=sc.nextInt();

        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
     spiral(arr,n);

    }
}
