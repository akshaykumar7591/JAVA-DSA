package CH5_Arrays;

import java.util.Scanner;

public class CheckArrayIsSort {
    static boolean occurOfElement(int[] arr){
        boolean ans =true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                ans =false;
                return ans;
            }

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
        boolean ans=occurOfElement(arr);
        System.out.println(ans);


    }


}

