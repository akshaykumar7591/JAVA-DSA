package CH5_Arrays;

import java.util.Scanner;

public class binary_search {
    public static int binarySEarch(int arr[],int key){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println("number is at "+binarySEarch(arr,key));
    }
}
