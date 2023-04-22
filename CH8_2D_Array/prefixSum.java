package CH8_2D_Array;

import java.util.Scanner;


public class prefixSum {
    static void printArray(int arr[][],int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.println(arr[i][j]+" ");;
            }
        }
    }
    static int  sumofBounder(int arr[][],int l1,int h1,int l2,int h2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=h1;j<=h2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
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
