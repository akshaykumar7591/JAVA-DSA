package CH12_Strings;

import java.util.Scanner;

public class reverse_each_word_in_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder str1=new StringBuilder("");
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                str1.append(ch);
            }
            else{
                str1.reverse();
                ans+=str1;
                ans+=" ";
                str1=new StringBuilder("");// another way str1.delete(0,str1.length())
            }
        }
        str1.reverse();
        ans+=str1;

        System.out.println(ans);

    }
}
