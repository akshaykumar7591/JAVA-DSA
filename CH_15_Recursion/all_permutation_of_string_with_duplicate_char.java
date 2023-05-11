package CH_15_Recursion;

import java.util.Scanner;

public class all_permutation_of_string_with_duplicate_char {
    public static void printpermutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            boolean flag=true;
            for(int j=i+1;j<ques.length();j++){
                if(ch==ques.charAt(j)){
                    flag=false;
                    break;
                }
            }

            if(flag==true){
                String str1=ques.substring(0,i)+ques.substring(i+1);
                printpermutation(str1,ans+ch);
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printpermutation(str,"");
    }
}
