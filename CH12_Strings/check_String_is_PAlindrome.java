package CH12_Strings;

import java.util.Scanner;

public class check_String_is_PAlindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str1=sc.nextLine();

        StringBuilder str=new StringBuilder(str1);
        str.reverse();

        String str2=str+"";

        if(str1.equals(str2)){ // not valid on StringBuilder
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
