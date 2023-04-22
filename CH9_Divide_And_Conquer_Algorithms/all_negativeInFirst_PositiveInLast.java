package CH9_Divide_And_Conquer_Algorithms;

import java.util.Scanner;

public class all_negativeInFirst_PositiveInLast {
    public static void parition(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            while(arr[i]<0)i++;
            while(arr[j]>=0)j--;
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
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
        parition(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
