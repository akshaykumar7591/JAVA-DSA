package CH_15_Recursion;

import java.util.Scanner;

public class Reverse_0f_String {
    // method 1
    public static String reverseOfString(String str, int idx){
        if(str.length()==idx){
            return "";
        }
        String smallAns=reverseOfString(str,idx+1);
        return smallAns+str.charAt(idx);
    }
    // method 2
    public static String reverseOfString1(String str){
        if(str.length()==0){
            return "";
        }
        String smallAns=reverseOfString1(str.substring(1));
        return smallAns+str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        System.out.println(reverseOfString(str,0));
        System.out.println(reverseOfString1(str));
    }
}
