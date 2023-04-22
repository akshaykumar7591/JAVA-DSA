package CH8_2D_Array;

import java.util.Scanner;

public class rotate2DArray {
    static void printArray(int arr3[][],int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transpose(int arr[][],int r1,int c1){

        for(int i=0;i<r1;i++){
            for(int j=i;j<c1;j++){  // main point for twist
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }


    }
    static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }

    static void rotate(int arr[][],int r1,int c1){
        transpose(arr,r1,c1);
        for(int i=0;i<r1;i++){
            reverse(arr[i]);
        }
        printArray(arr,r1,c1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // we used in this square array

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

        rotate(arr,r1,c1);
    }
}
