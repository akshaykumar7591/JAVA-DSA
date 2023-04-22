package CH5_Arrays;

import java.util.Scanner;

public class perfixSumInArray{
    static void sortArray(int[] arr){
        for(int i=1;i<arr.length;i++ ){
            arr[i]=arr[i-1]+arr[i];
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

       sortArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }


}

