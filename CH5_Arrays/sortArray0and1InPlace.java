package CH5_Arrays;

import java.util.Scanner;

public class sortArray0and1InPlace{
    static void swap(int arr[],int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortArray(int[] arr){
        int i=0;
        int j=arr.length-1;
       while(i<j){
            if(arr[i]==1 && arr[j]==0){
                swap(arr,i,j);
                i++;
                j--;
            }
             if(arr[i]==0){
                i++;

            }
             if(arr[j]==1){
                j--;
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

        sortArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }


}

