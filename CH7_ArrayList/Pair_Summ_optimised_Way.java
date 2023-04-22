package CH7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Find if any pair in Sorted ArrayList has a target sum
//2 pointer approach
public class Pair_Summ_optimised_Way {
    public static boolean pairSum(ArrayList<Integer> arr,int tar){
        int i=0;
        int j=arr.size()-1;
        while(i<j){
            if(arr.get(i)+arr.get(j)==tar){
                return true;
            }
            if(arr.get(i)+arr.get(j)<tar){
                i++;
            }
            else{
                j--;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println("enter target element which search in array :");
        int tar=sc.nextInt();
        boolean ans=pairSum(arr,tar);
        System.out.println(ans);
    }
}
