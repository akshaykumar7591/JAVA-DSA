package CH7_ArrayList;

import java.util.ArrayList;

public class TwoD_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        //making new arraylist in index o of mainlist Arraylist
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        mainList.add(list1);
        //making new Arraylist in index 1 of mainList Arraylist
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        mainList.add(list2);

        System.out.println(mainList);
        System.out.println(mainList.get(1));


        // syntax for printing ArrayList
        for(int i=0;i< mainList.size();i++){
            ArrayList<Integer> curr=mainList.get(i);
            for(int j=0;j< curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }

    }
}
