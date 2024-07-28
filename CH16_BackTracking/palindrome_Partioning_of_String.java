package CH_16_BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class palindrome_Partioning_of_String {
    public static void printpartionig(String str, List<String> list, List<List<String>> ans){
        if(str.length()==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=1;i<=str.length();i++){
            String s=str.substring(0,i);
            if(isPalindrome(s)) {
                list.add(s);
                printpartionig(str.substring(i), list,ans);
                list.remove(s);
            }
        }
    }

    private static boolean isPalindrome(String str) {
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        List<String> list=new ArrayList<>();
        List<List<String> > ans=new ArrayList<>();

        printpartionig(str,list,ans);
        System.out.println(ans);
    }
}
