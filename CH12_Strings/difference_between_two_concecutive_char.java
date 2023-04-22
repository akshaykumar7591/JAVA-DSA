package CH12_Strings;

import java.util.Scanner;

public class difference_between_two_concecutive_char {
      public static String solution(String str){
          // simple string method
       String ans="";
       ans=str.charAt(0)+"";
       for(int i=1;i<str.length();i++){
           int diff=(int)str.charAt(i)-str.charAt(i-1);
           ans+=diff;
           ans+=str.charAt(i);
       }
       return ans;
    }
    public static String solution2(String str){
        // simple string method
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            int diff=(int)str.charAt(i)-str.charAt(i-1);
           sb.append(diff);
           sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=solution2(str);
        System.out.println(str1);
    }
}
