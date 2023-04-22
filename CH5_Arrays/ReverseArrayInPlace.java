package CH5_Arrays;

import java.util.Scanner;

public class ReverseArrayInPlace{
    static void swap(int arr[],int i,int j ){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void reverseArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }



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

        reverseArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }


}

