package CH_21_Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverse_the_Queue {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        Stack<Integer> st=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        while (q.size()!=0){
            st.push(q.remove());
        }
        while (st.size()!=0){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
