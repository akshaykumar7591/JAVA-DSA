package CH_21_Queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class print_all_element_in_queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        Queue<Integer> helper=new ArrayDeque<>();
        while(q.size()!=0){
            System.out.print(q.peek()+" ");
            helper.add(q.remove());
        }
        while(helper.size()!=0){
            q.add(helper.poll());
        }
    }
}
