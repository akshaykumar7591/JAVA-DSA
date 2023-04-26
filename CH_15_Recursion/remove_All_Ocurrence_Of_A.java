package CH_15_Recursion;

import java.util.Scanner;

public class remove_All_Ocurrence_Of_A {
  // method 1
    public static String removeAllOccurenceOfA(String str,int idx){
        if(idx==str.length()){
            return "";
        }
        String smallAns=removeAllOccurenceOfA(str,idx+1);
        char ch=str.charAt(idx);
        if(ch!='a'){
            return  ch+smallAns;
        }
        else {
            return smallAns;
        }
    }
    // method 2 by using substring
    public static String removeAllOccurenceOfA1(String str){
        if(str.length()==0){
            return "";
        }
        String smallAns=removeAllOccurenceOfA1(str.substring(1));
        char ch=str.charAt(0);
        if(ch!='a'){
            return  ch+smallAns;
        }
        else {
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String str=sc.nextLine();

        String ans= removeAllOccurenceOfA(str,0);
        String ans1= removeAllOccurenceOfA1(str);
        System.out.println(ans);
        System.out.println(ans1);

    }
}
