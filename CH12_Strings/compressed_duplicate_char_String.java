package CH12_Strings;

import java.util.Scanner;

public class compressed_duplicate_char_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans=str.charAt(0)+"";
        int count=1;
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                if(count>1) {// means count is 1 then donot print
                    ans += count;
                }
                ans+=curr;
                count=1;


            }
        }
        if(count>1) {// means count is 1 then donot print
            ans += count;
        }
        System.out.println(ans);
    }
}
