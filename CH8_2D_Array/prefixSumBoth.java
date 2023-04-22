package CH8_2D_Array;

import java.util.Scanner;


public class prefixSumBoth {
    static void printArray(int arr[][],int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.println(arr[i][j]+" ");;
            }
        }
    }
    static void prifixSum(int arr[][]){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j]=arr[i][j-1]+arr[i][j];
            }
        }
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                arr[i][j]=arr[i][j]+arr[i-1][j];
            }
        }
    }
    static int  sumofBounder(int arr[][],int l1,int h1,int l2,int h2){
        prifixSum(arr);
        int sum=0, up=0,left=0,leftup=0;
        sum=arr[l2][h2];
        if(l1>0) {
            up = arr[l1 - 1][h2];
        }
        if(h1>0) {
            left = arr[l2][h1 - 1];
        }
        if(l1>0 && h1>0) {
            leftup = arr[l1 - 1][h1 - 1];
        }
        int total=sum-up-left+leftup;
//
        return total;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int l1=sc.nextInt();
        int h1=sc.nextInt();
        int l2=sc.nextInt();
        int h2=sc.nextInt();
        int sum=sumofBounder(arr,l1,h1,l2,h2);
        System.out.println(sum);

    }


}
