package CH14_Sliding_Window;

import java.util.HashMap;
import java.util.Scanner;

public class longest_substring_with_k_Unique_char {
  public static void  longestSubstring(String str,int k){
      int i=0;
      int j=0;
      int max=Integer.MIN_VALUE;
      HashMap<Character,Integer> map=new HashMap<>();// for stor char
      while(j<str.length()){
          char ch=str.charAt(j);
          if(map.containsKey(ch)){
              map.put(ch,map.get(ch)+1);
          }
          else{
              map.put(ch,1);
          }
          if(map.size()<k){
              j++;
          }
          else if(map.size()==k){
              max=Math.max(max,j-i+1);
              j++;
          }
          else if(map.size()>k){
              while(map.size()>k){
                 map.put(str.charAt(i),map.get(str.charAt(i))-1); // while sliding the window we remove the frequrnce 0f ele
                 if(map.get(str.charAt(i))==0){
                     map.remove(str.charAt(i));// and then remove element from map
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
        System.out.println("enter how many unique character want");
        int k=sc.nextInt();
        longestSubstring(str,k);
    }
}
