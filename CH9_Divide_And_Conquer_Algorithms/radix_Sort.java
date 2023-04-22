package CH9_Divide_And_Conquer_Algorithms;

import java.util.Scanner;

public class radix_Sort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int maxele(int arr[]){
        int ma=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            ma=Math.max(ma,arr[i]);
        }
        return ma;
    }
    public  static void countsort(int []arr,int place){
        int n=arr.length;

        // create new array for copy coutn frequeny element
        int [] output=new int[n];



        // now storing frequency of array element
        int count[]=new int[10];
        for(int i=0; i<arr.length;i++){
            count[(arr[i]/place)%10]++;
        }

        // now we can take prefix of arr it means index of output array
        for(int i=1; i<count.length;i++){
            count[i]+=count[i-1];
        }

        for(int i=n-1;i>=0;i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
//            System.out.println(idx + " "+ arr[i]);
            count[(arr[i]/place)%10]--;
        }

        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }

    }
    public static void radixSort(int arr[]){
        int max=maxele(arr);
        for(int place=1;max/place>0;place*=10){
            countsort(arr,place);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        radixSort(arr);
        print(arr);
    }
}
