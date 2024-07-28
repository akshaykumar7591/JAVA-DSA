package CH_15_Recursion;

import java.util.Scanner;

public class binary_String_Problem {
    public static void binaryString(int n,String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        ;
        if( str.length()==0 || str.charAt(str.length()-1)!='1'){
            binaryString(n-1,str+"1");
        }

            binaryString(n-1,str+"0");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        binaryString(n,"");
    }
}
