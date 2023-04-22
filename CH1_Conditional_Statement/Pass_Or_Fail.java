package CH1_Conditional_Statement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pass_Or_Fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String report=num>=33?"Pass":"Fail";
        System.out.println(report);
    }
}
