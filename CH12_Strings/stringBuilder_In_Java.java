package CH12_Strings;

import java.util.Scanner;

public class stringBuilder_In_Java {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Input;-
        StringBuilder str=new StringBuilder(sc.nextLine());

         //Another way creating stringBuilder
         // StringBuilder str=new StringBuilder("hello");
        //StringBuilder str=new StringBuilder(100); ---> capacity
        // StringBuilder str=new StringBuilder("");--> empty sting


        // function ;-
        // length;-
        System.out.println(str.length());
        // append(string);-
        str.append("kumar");
        System.out.println(str);
        //setCharAt(index,char);-
        str.setCharAt(2,'D');
        System.out.println(str);
        //insert(index,char);-
        str.insert(2,5.2f);
        //reverse();
        str.reverse();
        System.out.println(str);
        //delete(i,j);
        str.delete(0,3);
        System.out.println(str);
        //substring(i)/substring(i,j)
        System.out.println(str.substring(0));
        System.out.println(str.substring(0,6));
        //indexOf(string);
        System.out.println(str.indexOf("dd"));
        //lastIndexOf(char):-
        System.out.println(str.lastIndexOf("A"));
        System.out.println();

    }
}
