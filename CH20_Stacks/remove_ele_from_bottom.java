package CH_20_Stacks;
import java.util.Stack;

public class remove_ele_from_bottom {
    public static void remove(Stack<Integer> st){
        if(st.size()==1){
            st.pop();
            return;
        }
        int top=st.pop();
        remove(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        remove(st);
        System.out.println(st);
    }
}
