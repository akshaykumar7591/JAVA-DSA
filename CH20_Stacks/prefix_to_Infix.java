package CH_20_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class prefix_to_Infix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Stack<String> st=new Stack<>();

        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                String s=""+ch;
                st.push(s);
            }
            else {
                String v1=st.pop();
                String v2=st.pop();
                char chh=ch;
                String str1=v1+chh+v2;
                st.push(str1);
            }
        }
        System.out.println(st.peek());
    }
}
