package CH7_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// two pointer approach
public class contain_With_most_Water_optimised_Way {
    public static int storeWater(ArrayList<Integer> arr){
        int i=0;
        int j=arr.size()-1;
        int maxWater=0;
        while(i<j){
            int height=Math.min(arr.get(i),arr.get(j));
            int width=j-i;
            int currentWater=width*height;
            maxWater=Math.max(maxWater,currentWater);
            if(arr.get(i)<arr.get(j)){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        int ans=storeWater(arr);
        System.out.println(ans);
    }
}
