package CH6_Basics_Sorting;

import java.util.Scanner;

public class Insertion_Sort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int x=arr[i];
            int pre=i-1;
            while(pre>=0 && arr[pre]>x){
                arr[pre+1]=arr[pre];
                pre--;

            }
            arr[pre+1]=x;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        insertionSort(arr);
        print(arr);
    }
}
