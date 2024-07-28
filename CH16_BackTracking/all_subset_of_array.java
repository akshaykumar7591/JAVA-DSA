package CH_16_BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class all_subset_of_array {
    public static void printSubSet(int []arr ,int idx,List<Integer> list,List<List<Integer>> ans){
        if(idx==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        printSubSet(arr,idx+1,list,ans);
        list.add(arr[idx]);
        printSubSet(arr,idx+1,list,ans);
        list.remove(list.size()-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter unique coin ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        printSubSet(arr,0,list,ans);
        System.out.println(ans);
    }
}
