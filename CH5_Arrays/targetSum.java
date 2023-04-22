package CH5_Arrays;

import java.util.Scanner;

public class targetSum {
    static int targetSumofEle(int[] arr,int num){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==num){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter "+size+"of element : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        int num;
        System.out.println("enter number : ");
        num=sc.nextInt();
        System.out.println(targetSumofEle(arr,num));



    }


}

