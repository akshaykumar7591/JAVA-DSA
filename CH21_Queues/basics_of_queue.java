package CH_21_Queues;

import java.util.*;

public class basics_of_queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new ArrayDeque<>();
        q.add( 1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q);
        q.remove();
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
}
