package CH7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Contain_With_Most_Water {
    public static int storeWater(ArrayList<Integer> arr){
        int maxWater=0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                int height=Math.min(arr.get(i),arr.get(j));
                int width=j-i;
                int currentWater=width*height;
                maxWater=Math.max(maxWater,currentWater);

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
