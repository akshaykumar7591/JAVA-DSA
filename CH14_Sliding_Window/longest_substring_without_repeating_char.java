package CH14_Sliding_Window;

import java.beans.Introspector;
import java.util.HashMap;
import java.util.Scanner;

public class longest_substring_without_repeating_char {
   public static void longestSubstring(String str){
       int i=0;
       int j=0;
       int n=str.length();
       int max= Integer.MIN_VALUE;
       HashMap<Character,Integer> map=new HashMap<>();
       while(j<n){
           char ch=str.charAt(j);
           if(map.containsKey(ch)){
               map.put(ch,map.get(ch)+1);
           }
           else{
               map.put(ch,1);
           }
           if(map.size()==j-i+1){
               max=Math.max(max,j-i+1);
               j++;

           }
           else if(map.size()<j-i+1){
               while(map.size()<j-i+1){
                   map.put(str.charAt(i),map.get(str.charAt(i))-1);
                   if(map.get(str.charAt(i))==0){
                       map.remove(str.charAt(i));
                   }
                   i++;
               }
               j++;
           }
       }
       System.out.println(max);
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        longestSubstring(str);
    }
}
