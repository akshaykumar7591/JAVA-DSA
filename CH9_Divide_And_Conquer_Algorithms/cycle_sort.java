package CH9_Divide_And_Conquer_Algorithms;

import java.util.Scanner;
// This sorting techniqe is always used in min range
// -----------this question only depend on range -----------
public class cycle_sort {
    public static void swap(int[] arr ,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

    }
    public static void cycleSort(int []arr){
        int i=0;
        while(i<arr.length){
            int idx=arr[i]-1;// in range 1 to n so we do for indxing arr[i]-1
            if(arr[i]!=arr[idx]){
                swap(arr,i,idx);

            }
            else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        cycleSort(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
