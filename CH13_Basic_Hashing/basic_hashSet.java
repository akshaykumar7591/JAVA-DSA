package CH13_Basic_Hashing;

import java.util.HashSet;
import java.util.Iterator;


public class basic_hashSet {
    public static void main(String[] args) {

        //creation
        HashSet<Integer> set = new HashSet<>();
        //insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //print hashset
        System.out.println(set);

        //search
        if (set.contains(-1)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        // delete
        set.remove(2);
        System.out.println(set);

        // size
        System.out.println("size of set is : "+set.size());

        // iteration in hashset
        Iterator it= set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
