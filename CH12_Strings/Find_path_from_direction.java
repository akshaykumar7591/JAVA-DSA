package CH12_Strings;

import java.util.Scanner;

public class Find_path_from_direction {
    public static void getpath(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='E'){
                 x++;
            }
            else if(ch=='N'){
                y++;
            }
            else if(ch=='S'){
                y--;
            }
            else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        System.out.println((float)Math.sqrt(x2+y2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        getpath(str);
    }
}
