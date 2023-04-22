package CH7_ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

// Find if any pair in Sorted ArrayList has a target sum
public class Pair_Sum1 {
    public static boolean pairSum(ArrayList<Integer> arr,int tar){
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)+arr.get(j)==tar){
                    return true;
                }
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
