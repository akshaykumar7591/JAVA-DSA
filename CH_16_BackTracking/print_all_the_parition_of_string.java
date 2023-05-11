package CH_16_BackTracking;

import java.util.Scanner;

public class print_all_the_parition_of_string {
    public static void printpartionig(String str,String ans){
        if(str.length()==0){
            System.out.println(ans+" ");
            return;
        }
        for(int i=1;i<=str.length();i++){
            printpartionig(str.substring(i),ans+str.substring(0,i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printpartionig(str,"");
    }
}
