package CH8_2D_Array;

import java.util.Scanner;

public class pascalTriangle {
    static void printArray(int arr3[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }

   static void pascaltriangle(int n){
        int ans[][]=new int[n][];
        for(int i=0;i<n;i++){
            // for ith row has i+1 column
            ans[i]=new int[i+1];
            //first and last column have same value 1
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        printArray(ans,n);

   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter row for making pascal triangle:");
        n=sc.nextInt();
        pascaltriangle(n);



    }
}
