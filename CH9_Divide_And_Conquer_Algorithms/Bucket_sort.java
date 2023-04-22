package CH9_Divide_And_Conquer_Algorithms;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Bucket_sort {
    public static void print(float arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void  bucketSort(float[] arr){
        int n=arr.length;
        //buckets
        ArrayList<Float>[] bucket=new ArrayList[n];
        //create empty buckets
        for(int i=0;i<n;i++){
            bucket[i]=new ArrayList<Float>();
        }
        //add element in aour bucket
        for(int i=0;i<n;i++){
            int bucketIndex=(int)arr[i] * n;
            bucket[bucketIndex].add(arr[i]);
        }
        // sort buckets
        for(int i=0;i<bucket.length;i++){
            Collections.sort(bucket[i]);
        }
        // merge all sorted bucket in array
        int idx=0;
        for(int i=0;i<bucket.length;i++){
            ArrayList<Float> current=bucket[i];
            for(int j=0;j<current.size();j++){
                arr[idx++]=current.get(j);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float arr[]=new float[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextFloat();
        }
        bucketSort(arr);
        print(arr);
    }
}
