package CH5_Arrays;

import java.util.Scanner;

public class Trapping_rainWater {
    public static int  trappingWater(int arr[]){
        int n=arr.length;
        //left max boundary
        int left[]=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(arr[i],left[i-1]);
        }
        //right max boundary
        int right[]=new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int water=Math.min(left[i],right[i]);
            trappedwater+=water-arr[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("trapped rain water is: "+trappingWater(arr));
    }
}
