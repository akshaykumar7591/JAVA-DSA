package CH11_Linear_Search;

import java.util.Scanner;

public class Search_in_string {
    public static void presentOrNot(String sp,char st){
        int c=0;
        for(int i=0;i<sp.length();i++){
            if(st==sp.charAt(i)){
                c=1;
                break;

            }

        }
        if(c==1){
            System.out.println("yes");

        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sp=sc.nextLine();
       char st=sc.next().charAt(0);
       presentOrNot(sp,st);
    }
}
