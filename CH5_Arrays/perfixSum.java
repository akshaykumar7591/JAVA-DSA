package CH5_Arrays;

import java.util.Scanner;

public class perfixSum{
    static int[] sortArray(int[] arr){
        int ans[]=new int[arr.length];
        ans[0]=arr[0];
        int x=0;
       for(int i=1;i<arr.length;i++ ){
           ans[i]=ans[i-1]+arr[i];
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

        int ans[]=sortArray(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }



    }


}

