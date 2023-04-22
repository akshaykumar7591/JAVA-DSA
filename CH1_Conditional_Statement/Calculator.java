package CH1_Conditional_Statement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number :");
        int num1=sc.nextInt();
        System.out.println("enter number 2 : ");
        int num2=sc.nextInt();
        System.out.println("enter operation :");
        char operator=sc.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("invalid operation ");
        }
    }
}
