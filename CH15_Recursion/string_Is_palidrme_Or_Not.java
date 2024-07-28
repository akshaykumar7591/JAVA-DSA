package CH_15_Recursion;

import java.util.Scanner;

public class string_Is_palidrme_Or_Not {
    // method 1 with help of reverse method
    public static String reverse(String str){
        if(str.length()==0){
            return "";
        }
        String ans=reverse(str.substring(1));
        return ans+str.charAt(0);
    }
    // method 2 with 2 pointer apporach
    public static boolean palindrome(String str,int st,int end){
        if(st>=end){
            return true;
        }
        if(str.charAt(st)!=str.charAt(end)){
            return false;
        }
        return palindrome(str,st+1,end-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

//        String rev=reverse(str);
//        //method 1
//        if(str.equals(rev)){
//            System.out.printf("%s palidrome ",str);
//        }
//        else{
//            System.out.printf("%s not palindrome",str);
//        }
        // method 2
        if(palindrome(str,0,str.length()-1)){
            System.out.printf("%s palidrome ", str);
        }
        else{
            System.out.printf("%s not palindrome",str);
        }

    }
}
