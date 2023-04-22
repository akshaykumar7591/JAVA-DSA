package CH5_Arrays;

import java.util.Scanner;

public class SEcondlargestEle {
    static int largestEle(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        return max;
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

        int max=largestEle(arr);
        for(int i=0;i<size;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int max2=largestEle(arr);
        System.out.println(max2);



    }


}

