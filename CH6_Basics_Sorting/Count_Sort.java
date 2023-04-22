package CH6_Basics_Sorting;

import java.util.Scanner;

public class Count_Sort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void CountSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(arr[i],largest);
        }
        int count[]=new int[largest+1];
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
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
        CountSort(arr);
        print(arr);
    }
}
