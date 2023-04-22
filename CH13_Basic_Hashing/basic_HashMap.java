package CH13_Basic_Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class basic_HashMap {
    public static void main(String[] args) {
        //creation
        HashMap<Integer,Integer> map=new HashMap<>();
        //insertion

        map.put(1,3);
        map.put(2,5);
        map.put(3,5);
        //print
        System.out.println(map);
      map.put(2,3); // it will update the value of 2;
        System.out.println(map);
   // seaarch
        //1) containsKey
     if(map.containsKey(2)){
         System.out.println("present");
     }
     else {
         System.out.println("not present");
     }

     //2) get
        System.out.println(map.get(2));
        System.out.println(map.get(9));

        // iteration in hashmap
        // 1) way
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        // 2) way
        Set<Integer> key=map.keySet();
        for(int keys:key){
            System.out.print(keys+" ");
        }
        System.out.println();

        // remove
        map.remove(2);
        System.out.println(map);
        System.out.println(map.size());
    }
}
