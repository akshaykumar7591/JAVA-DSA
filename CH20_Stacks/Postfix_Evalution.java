package CH_20_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Postfix_Evalution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }
            else {
                int v2=st.pop();
                int v1=st.pop();
                if (ch == '-') st.push(v1-v2);
                if (ch == '+') st.push(v1+v2);
                if (ch == '*') st.push(v1*v2);
                if (ch == '/') st.push(v1/v2);
            }
        }
        System.out.println(st.peek());
    }
}
