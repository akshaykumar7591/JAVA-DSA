package CH_20_Stacks;

import java.util.Stack;

public class reverse_Stack {

    // method 1- recursively using bootom insert apparoach
    public static void bottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        bottom(st,x);
        st.push(top);

    }
    public static void reverse(Stack<Integer> st){
    if(st.size()==1){
        return;
    }
    int top=st.pop();
    reverse(st);
    bottom(st,top);
    }
    //method 2-iteratively
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
