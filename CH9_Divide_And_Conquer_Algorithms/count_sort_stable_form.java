package CH9_Divide_And_Conquer_Algorithms;

import java.util.Scanner;

// this is also a count sort but difference is this in we can maintaing the order

public class count_sort_stable_form {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public  static void countSortStable(int [ ]arr){
        int n=arr.length;

        // create new array for copy coutn frequeny element
        int [] output=new int[n];

        // find max for size of count array
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(arr[i],largest);
        }

        // now storing frequency of array element
        int count[]=new int[largest+1];
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }

        // now we can take prefix of arr it means index of output array
        for(int i=1; i<count.length;i++){
            count[i]+=count[i-1];
        }

        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
//            System.out.println(idx + " "+ arr[i]);
            count[arr[i]]--;
        }

        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        countSortStable(arr);
        print(arr);
    }
}
