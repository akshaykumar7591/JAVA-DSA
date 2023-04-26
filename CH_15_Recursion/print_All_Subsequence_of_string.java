package CH_15_Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class print_All_Subsequence_of_string {
    // method 1 store all subsequence in ArrayList
    public static ArrayList<String> subsequence(String str){
        ArrayList<String> list=new ArrayList<>();
        if(str.length()==0){
            list.add("");
            return list;
        }
        char ch=str.charAt(0);
        ArrayList<String > ans=subsequence(str.substring(1));
        for(String val: ans){
            list.add(val);
            list.add(ch+val);

        }
        return list;
    }

    // method to print all subsequence
    public static void subsequence1(String str,String currStr){
        if(str.length()==0){
            System.out.print(currStr+" ,");
            return ;
        }
        char ch=str.charAt(0);
        String remstr=str.substring(1);
        subsequence1(remstr,currStr+ch);
        subsequence1(remstr,currStr);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        ArrayList<String> ans=subsequence(str);
        System.out.println(ans);
        subsequence1(str,"");
    }
}
