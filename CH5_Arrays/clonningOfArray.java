package CH5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class clonningOfArray {
    static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter size of array :");
        size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //int arr2[]=arr;                                              iska use krne se dono array may changr ho rha tha
//        int arr2[]=arr.clone();                                       -------Method 1-------change na ho arrays
//        int arr2[]= Arrays.copyOf(arr,size);                          ---------Method 2-----------
        int arr2[]= Arrays.copyOfRange(arr,0,size);   //         ---------Mehod 3--------------
        arr2[0]=0;
        arr2[1]=0;
        printArray(arr);
        System.out.println();
        printArray(arr2);


    }
}

// This is the change in cloneArray
