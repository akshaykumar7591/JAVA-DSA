package CH7_ArrayList;


// find if any pair in a sorted and rotated Arraylist has a target sum
// 2pointer approach
import java.util.ArrayList;
import java.util.Scanner;

public class Pair_Sum2_optimised_way {
    public static  boolean pairSum2(ArrayList<Integer> arr,int tar){
        int n=arr.size();
        int breakpoint=-1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>arr.get(i+1)){
                breakpoint=i;
                break;
            }
        }
        int lp=breakpoint+1;
        int rp=breakpoint;
        while(lp!=rp){
            if((arr.get(lp)+arr.get(rp))==tar){
                return true;
            }
            if(arr.get(lp)+arr.get(rp)<tar){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        // example oof array like [11,12,6,8,9,10] target ==10
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
        System.out.println(pairSum2(arr,tar));

    }
}
