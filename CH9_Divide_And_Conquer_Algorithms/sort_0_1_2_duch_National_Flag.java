package CH9_Divide_And_Conquer_Algorithms;

import java.util.Scanner;
// sorting using 3 pointer is called Duch National Flag
public class sort_0_1_2_duch_National_Flag {
    public static void swap(int[] arr ,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

    }
    public static void sort012(int []arr) {
        int n = arr.length;
        int l = 0, mid = 0, h = n - 1;
        while (mid <= h) {
            if (arr[mid] == 0) {
                swap(arr, l, mid);
                mid++;
                l++;
            }
             else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, h);
                h--;
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
        sort012(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
