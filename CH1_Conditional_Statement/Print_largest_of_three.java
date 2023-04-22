package CH1_Conditional_Statement;

import java.util.Scanner;

public class Print_largest_of_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num>num2 && num>num3){
            System.out.println(num+" is greater ");
        }
        else if(num2>num3){
            System.out.println(num2+" is greater ");
        }
        else{
            System.out.println(num3+" is greater ");
        }
    }
}
