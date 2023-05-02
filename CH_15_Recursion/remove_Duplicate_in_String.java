package CH_15_Recursion;

import java.util.Scanner;

public class remove_Duplicate_in_String {
    public static void removeDuplicat(String str, int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;

        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            removeDuplicat(str,idx+1,newstr,map);
        }
        else{
            map[currchar-'a']=true;
            removeDuplicat(str,idx+1,newstr.append(currchar),map);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        removeDuplicat(str,0,new StringBuilder(""),new boolean[26]);
    }
}
