package CH5_Arrays;

import java.util.Scanner;

public class sortInSquareOrder{
    static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static int[] sortArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        int ans[]=new int[j+1];
        int x=0;
        while(i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[x++]=arr[i]*arr[i];
                i++;
            }
            else{
                ans[x++]=arr[j]*arr[j];
                j--;
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

        int ans[]=sortArray(arr);
        reverse(ans);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }



    }


}

