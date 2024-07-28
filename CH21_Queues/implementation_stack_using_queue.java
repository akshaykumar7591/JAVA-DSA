package CH_21_Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class implementation_stack_using_queue {
    // Approach 1 -- push efficient
    public static class Mystack{
        Queue<Integer> q=new ArrayDeque<>();
        public   Mystack(){

        }
        public void push(int x){
            q.add(x);
        }
        public int pop(){
            for(int i=1;i<q.size();i++){
                q.add(q.remove());
            }
            int val=q.remove();
            return val;
        }
        public int peek(){
            for(int i=1;i<q.size();i++){
                q.add(q.remove());
            }
            int val=q.peek();
            q.add(q.remove());
            return val;
        }
        public boolean isEmpy(){
            if(q.size()==0)return true;
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Mystack st=new Mystack();
        st.peek();

    }
}
