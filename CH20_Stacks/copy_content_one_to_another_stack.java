package CH_20_Stacks;

import java.util.Stack;

public class copy_content_one_to_another_stack {
    //display stack
    public static void display(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top=st.peek();
        st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        // user input
//        for(int i=0;i<n;i++){
//            int x=sc.nextInt();
//            st.push(x);
//        }
        Stack<Integer> copy=new Stack<>();
        Stack<Integer> helper=new Stack<>();
        while (st.size()>0){
            helper.push(st.pop());
        }
        while (helper.size()>0){
            copy.push(helper.pop());
        }
        System.out.println(copy);
        display(copy);
        System.out.println(copy);
    }
}
