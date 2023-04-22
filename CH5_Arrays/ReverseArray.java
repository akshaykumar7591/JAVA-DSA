package CH5_Arrays;

import java.util.Scanner;

public class ReverseArray {
    static int[] reverseArray(int[] arr){
        int ans[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            ans[j++]=arr[i];

        }
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

       int ans[]= reverseArray(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }



    }


}

