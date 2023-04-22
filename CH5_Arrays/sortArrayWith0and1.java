package CH5_Arrays;

import java.util.Scanner;

public class sortArrayWith0and1{
    static int[] sortArray(int[] arr){
       int count=0;
       int ans[]=new int[arr.length];
       for(int i=0;i<arr.length;i++){
           if(arr[i]==0){
               count++;
           }
        }
       for(int j=0;j<arr.length;j++){
           if(j<count){
               ans[j]=0;
           }
           else{
               ans[j]=1;
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
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }



    }


}

