package CH5_Arrays;

import java.util.Scanner;

public class UNiqueEleINArray {
    static void uniqueEle(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
               if(arr[i]>-1) {
                   System.out.println(arr[i]);
               }

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

        uniqueEle(arr);



    }


}

