package CH_15_Recursion;

import java.util.Scanner;

public class basic_question_0n_Array {
    // for print arrray

    public static void printArray(int arr[],int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");
        printArray(arr,idx+1);
    }
 /// for max find max element in array
    public static int maxArrayElement(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallAns=maxArrayElement(arr,idx+1);
        return  Math.max(arr[idx],smallAns);
    }
// for find sum of array
    public static  int sumOfArray(int arr[],int idx){
        if(idx==arr.length){
            return 0;
        }
        int smallAns=sumOfArray(arr,idx+1);
        return arr[idx]+smallAns;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

//        printArray(arr,0);
        System.out.println(maxArrayElement(arr,0));
        System.out.println(sumOfArray(arr,0));
    }
}
