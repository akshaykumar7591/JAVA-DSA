package CH_15_Recursion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes;

public class find_all_index_of_target_element {
    // for print all index
    public static void printallIndex(int arr[],int target,int idx){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==target){
            System.out.print(idx+" ");
        }
        printallIndex(arr,target,idx+1);
    }

    // it is for store all index in arraylist
    public static ArrayList<Integer> printallIndex1(int arr[],int target,int idx){
        ArrayList<Integer> ans=new ArrayList<>();
        if(idx == arr.length){
            return ans;
        }
        if(arr[idx]==target){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns=printallIndex1(arr,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
//        printallIndex(arr,target,0);
        ArrayList<Integer> ans=printallIndex1(arr,target,0);
        System.out.println(ans);
    }
}
