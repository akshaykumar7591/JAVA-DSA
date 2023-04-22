package CH12_Strings;

import java.util.Scanner;

public class toggle_all_char_In_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        String ans="";
        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            int asci=(int)ch;
            boolean flag=true;// means it is in capital assuming

            if(ch==' ')continue;

            if(asci>=97){
                flag=false;
            }

            if(flag==true){
                asci+=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
            else{
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);

            }

        }
        System.out.println(str);
    }
}
