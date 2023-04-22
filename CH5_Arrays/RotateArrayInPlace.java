package CH5_Arrays;

import java.util.Scanner;

public class RotateArrayInPlace{
    static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotateArray(int[] arr,int k){
        int n=arr.length;
        k=k%n;

        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter "+size+"of element : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        int step;
        System.out.println("enter how step : ");
        step=sc.nextInt();

        rotateArray(arr,step);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }


}

