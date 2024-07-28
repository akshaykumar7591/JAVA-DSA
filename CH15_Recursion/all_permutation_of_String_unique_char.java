package CH_15_Recursion;

import java.util.Scanner;

public class all_permutation_of_String_unique_char {
    public static void printpermutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<ques.length();i++){
            String str1=ques.substring(0,i)+ques.substring(i+1);
            char ch=ques.charAt(i);
            printpermutation(str1,ans+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printpermutation(str,"");
    }
}
