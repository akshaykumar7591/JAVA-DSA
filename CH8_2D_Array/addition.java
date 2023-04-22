package CH8_2D_Array;

import java.util.Scanner;

public class addition {
    static void printArray(int arr3[][],int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void addition(int arr[][],int r1,int c1,int arr1[][],int r2,int c2){
        int arr3[][]=new int[r1][c1];
        if(r1!=r2 ||c1!=c2){
            System.out.println("Wrong addition is not possible");
            return;
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr3[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        printArray(arr3,r1,c1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1,c1;
        System.out.println("enter row of 1st matrix :");
        r1=sc.nextInt();
        System.out.println("enter col of 1st matrix :");
        c1=sc.nextInt();
        int arr[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int r2,c2;
        System.out.println("enter row of 2st matrix :");
        r2=sc.nextInt();
        System.out.println("enter col of 2st matrix :");
        c2=sc.nextInt();
        int arr1[][]=new int[r2][c2];
        for(int i=0;i<r2;i++) {
            for (int j = 0; j < c2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        addition(arr,r1,c1,arr1,r2,c2);
    }
}
