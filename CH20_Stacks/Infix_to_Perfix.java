package CH_20_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Infix_to_Perfix {
    public static String infixToPrefix(String str){
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int )ch;
            if(ascii>=48 && ascii<=57 ){
                String s=""+ch;
                val.push(s);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if (ch==')'){
                while (op.peek()!='('){
                    String v2=val.pop();
                    String v1=val.pop();
                    char chh=op.pop();
                    String str1=chh+v1+v2;
                    val.push(str1);
                }
                op.pop();
            }
            else {
                if(ch=='+'|| ch=='-'){
                    String v2=val.pop();
                    String v1=val.pop();
                    char chh=op.pop();
                    String str1=chh+v1+v2;
                    val.push(str1);
                    op.push(ch);
                }
                if(ch == '*' || ch == '/') {
                    if (op.peek()=='*'|| op.peek()=='/') {
                        String v2=val.pop();
                        String v1=val.pop();
                        char chh=op.pop();
                        String str1=chh+v1+v2;
                        val.push(str1);
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }
        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char chh=op.pop();
            String str1=chh+v1+v2;
            val.push(str1);
        }
        return val.peek();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(infixToPrefix(str));
    }
}
