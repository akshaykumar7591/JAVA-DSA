package CH_15_Recursion;

import java.util.Scanner;

public class last_occurence_of_element {

    public static int lastOccurence(int arr[],int n,int target,int idx){
        if(idx==n){
            return -1;
        }
        int isFound=lastOccurence(arr,n,target,idx+1);
        if(isFound==-1 && arr[idx]== target){
            return idx;
        }
        return isFound;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(lastOccurence(arr,n,target,0));
    }
}
