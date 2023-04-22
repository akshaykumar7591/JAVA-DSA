package CH9_Divide_And_Conquer_Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class cycleSort3_duplicate_element {
    public static void swap(int[] arr ,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

    }
    public static int  cycleSort(int []arr){
        int i=0;
int ans=0;
        while(i<arr.length){
            if(arr[i]!=i+1) {
                int idx=arr[i]-1;// in range 1 to n so we do for indxing arr[i]-1
                if (arr[i] != arr[idx]) {
                    swap(arr, i, idx);
                }
                else{
                    ans=arr[i];
                    break;
                }
            }
            else{
                i++;
            }
        }


        return ans;
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
