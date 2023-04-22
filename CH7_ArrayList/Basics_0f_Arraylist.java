package CH7_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Basics_0f_Arraylist {
    public static void swap(ArrayList<Integer> list,int i,int j){
        int temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        // how element in Arraylist ---- using (add) function
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(5);

        //add element at particular index
        list.add(0,10);

        // gernally print arraylist
        System.out.println(list);

        // we get single single element by( get) function
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(0));

         //we remove element from list by using (remove) function
        list.remove(4);
        System.out.println(list);

        // add at give place use (set) function
        list.set(2,66);
        System.out.println(list);

        // if we find element is exit or not in array use (contain) function
        System.out.println(list.contains(55));// return false

        // to get size of array use (size) function
        System.out.println(list.size());

        // reverse arraylist
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        // maximum in arraylist
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(max,list.get(i));
        }
        System.out.println("max element in array : "+max);

        //swap two number
        swap(list,2,3);
        System.out.println(list);

        //sort arrayList
         Collections.sort(list);
        System.out.println("sort array is: "+list);

        // sort arraylist in decresing order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);



    }
}
