package CH5_Arrays;

import java.util.Scanner;

public class pair_in_Array {
    public static void pairOfArray(int arr[]){
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        pairOfArray(arr);
    }
}
