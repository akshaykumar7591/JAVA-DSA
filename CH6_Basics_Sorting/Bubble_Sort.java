package CH6_Basics_Sorting;

import java.util.Scanner;

public class Bubble_Sort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=true;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag){
                return;
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        print(arr);
    }
}
