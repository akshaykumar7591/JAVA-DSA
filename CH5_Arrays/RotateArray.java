package CH5_Arrays;

import java.util.Scanner;

public class RotateArray{
    static int[] rotateArray(int[] arr,int k){
        k=k%arr.length;
        int ans[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-k;i<arr.length;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<arr.length-k;i++){
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
        int step;
        System.out.println("enter how step : ");
        step=sc.nextInt();

        int ans[]=rotateArray(arr,step);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }



    }


}

