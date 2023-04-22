package CH5_Arrays;

import java.util.Scanner;

public class Linear_Search {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();

        }
        int key=sc.nextInt();
        int ans=linearSearch(arr,key);
        if(ans==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found element at index :"+ans);
        }

    }
}
