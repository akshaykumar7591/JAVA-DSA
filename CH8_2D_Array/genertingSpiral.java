package CH8_2D_Array;

import java.util.Scanner;

public class genertingSpiral {
    static void printArray(int arr3[][],int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int [][] spiral(int n){
        int arr[][]=new int[n][n];
        int top=0,bottom=n-1,left=0,right=n-1;
        int count=1;
        while(count<=n*n){
            //top ---left to right
            for(int i=left;i<=right && count<=n*n;i++){
                arr[top][i]=count;
                count++;
            }
            top++;
            //right --top bottom
            for(int i=top;i<=bottom && count<=n*n;i++){
                arr[i][right]=count;
                count++;
            }
            right--;
            //bottom right left

            for(int i=right;i>=left && count<=n*n;i--){
                arr[bottom][i]=count ;
                count++;
            }
            bottom--;

            // left --bootom top
            for(int i=bottom;i>=top && count<=n*n;i--){
                arr[i][left]=count;
                count++;
            }
            left++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter size of matrix :");
        n=sc.nextInt();

        int arr[][]=spiral(n);
        printArray(arr,n,n);

    }
}
