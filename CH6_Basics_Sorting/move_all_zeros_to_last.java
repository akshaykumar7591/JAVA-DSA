package CH6_Basics_Sorting;

import java.util.Scanner;
// Question :- give an integer array , move all 0`s at the end of it while maintaing the relative order of non zeros element

public class move_all_zeros_to_last {
    public static void movesZeros(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int val: arr){
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        movesZeros(arr);
    }
}
