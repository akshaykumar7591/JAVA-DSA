package CH_21_Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverse_first_K_element_in_Queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new ArrayDeque<>();
        Stack<Integer> st=new Stack<>();
        int k=sc.nextInt();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        int size =q.size()-k;
        int size1=q.size();
        while (size1>=k){
            st.push(q.remove());

        }
        System.out.println(q);
        System.out.println(q.size());
        while (st.size()!=0){
            q.add(st.pop());
        }
        System.out.println(q);
        while(size!=0){
            q.add(q.remove());
            size--;
        }


        System.out.println(q);
    }
}
