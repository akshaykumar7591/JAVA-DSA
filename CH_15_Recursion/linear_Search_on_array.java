package CH_15_Recursion;

import java.util.Scanner;

public class linear_Search_on_array {
    // it is only for return boolean value
    public static boolean linearSearch(int arr[],int target,int idx){
        if(idx==arr.length){
            return false;
        }
        if(arr[idx]==target){
            return true;
        }
        return linearSearch(arr,target,idx+1);
    }

    // for return index for element;
    public static int  linearSearch1(int arr[],int target,int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        return linearSearch1(arr,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int target=sc.nextInt();
        if(linearSearch(arr,target,0)){
            System.out.println("prsent");
        }
        else{
            System.out.println("not found");
        }
        System.out.println(linearSearch1(arr,target,0));
    }
}
