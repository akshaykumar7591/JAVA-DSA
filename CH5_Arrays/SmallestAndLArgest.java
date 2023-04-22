package CH5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLArgest {
    static int[] occurOfElement(int[] arr){
        Arrays.sort(arr);
        int ans[]=new int[2];
        ans[0]=arr[0];
        ans[1]=arr[arr.length-1];


        return ans;

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
        int[] ans=occurOfElement(arr);
        System.out.println(ans[0]);
        System.out.println(ans[1]);


    }


}

