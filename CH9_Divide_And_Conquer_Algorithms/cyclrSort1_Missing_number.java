package CH9_Divide_And_Conquer_Algorithms;

import java.util.Scanner;

public class cyclrSort1_Missing_number {
    public static void swap(int[] arr ,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

    }
    public static int  cycleSort(int []arr){
        int i=0;

        while(i<arr.length){
            int idx=arr[i];// in range 1 to n so we do for indxing arr[i]
            if(arr[i]!=arr[idx]){
                swap(arr,i,idx);

            }
            else{
                i++;
            }
        }
       for( i=0;i<arr.length;i++){
           if(arr[i]!=i){
               return i;
           }
       }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(cycleSort(arr));

    }
}
