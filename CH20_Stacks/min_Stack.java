package CH_20_Stacks;

import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class min_Stack {
    // method 1 - first push all element in stack and while pushing also check the min element in variable

    static class  MinStack{
        Stack<Integer> st=new Stack<>();
        Stack<Integer> min=new Stack<>();
        // method 2- by creating new stack
        public void push(int val){
            if(st.size()==0){
                st.push(val);
                min.push(val);
            }
            else{
                st.push(val);
                if(min.peek()<val){
                    min.push(min.peek());
                }
                else{
                    min.push(val);
                }
            }
        }
        void pop(){
            st.pop();
            min.pop();
        }
        public int top(){
            return st.peek();
        }
        public int getMin(){
            return min.peek();
        }
        // --------------------------------------------------method 3--------------------------------------------------------
       Stack<Long> stt=new Stack<>();
        long min1=-1;
        public void push1(int val){
            long x=(long) val;
            if(st.size()==0){
                stt.push(x);
               min1=x;
            }
            else if(x>=min1){
                stt.push(x);
            }
            else if(x<min1){
                stt.push(2*x-min1);
                min1=x;
            }
        }
        public void pop1(){
            if(stt.size()==0){
                return;
            }
            else if(stt.peek()>=min1){
                stt.pop();
            }
            else if(stt.peek()<min1){
                long old=2*min1-stt.peek();
                min1=old;
                stt.pop();
            }
        }
        public int  top1(){
            long q=st.peek();
            if(stt.size()==0){
                return -1;
            }
             if(q>=min1){
                return (int )q;
            }
            if(q<min1){
               return (int)min1;
           }
           return 0;
        }
        public int getmin(){
            if(stt.size()==0){
                return -1;
            }
            return (int )min1;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        int ans=minStack(arr);
//        System.out.println(ans);
    }
}
