package CH_15_Recursion;

import java.util.Scanner;

public class keypad_combinations {
    public static void combination(String str,String[] kp,String rev){
        if(str.length()==0){
            System.out.print(rev+" ");
            return;
        }
        int currNum=str.charAt(0)-'0';
        String currChoice=kp[currNum];
        for(int i=0;i<currChoice.length();i++){
            combination(str.substring(1),kp,rev+currChoice.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String kp[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        combination(str,kp,"");

    }
}
