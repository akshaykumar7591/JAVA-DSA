package CH9_Divide_And_Conquer_Algorithms;

import java.util.Scanner;

public class Quick_sort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static int partion(int[] arr,int st,int end){
       int pivate=arr[st];
       int count=0;
       //finding how many element is greater than pivate
       for(int i=0;i<arr.length;i++){
           if(arr[i]<pivate){
               count++;
           }
       }
       // Now swap pivate element with index
       int pivate_index=count;
       swap(arr,st,pivate_index);
       int i=st;
       int j=end;
       while(i<pivate_index && j>pivate_index){
           // = is used if pivate element is repeated
           while(arr[i]<=pivate)i++;
           while(arr[j]>pivate)j--;
           // now check i and j is valid
           if(i<pivate_index && j>pivate_index) {
               swap(arr, i, j);
               i++;
               j--;
           }
       }

       return pivate_index;
    }
    public static void quickSort(int arr[],int st,int end){
        if(st>=end){
            return ;

        }
        int j=partion(arr,st,end);
        quickSort(arr,st,j-1); // end = pivate -1
        quickSort(arr,j+1,end);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,n-1);
        print(arr);
    }
}
