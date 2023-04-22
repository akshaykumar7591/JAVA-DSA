package CH5_Arrays;

import java.util.Scanner;

public class lastOcurrenceOfEle {
    static int occurOfElement(int[] arr,int num){
        int count =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count=i;
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
        System.out.println("enter element which find : ");
        num=sc.nextInt();
        int ans=occurOfElement(arr,num);
        System.out.println(ans);


    }


}

