package CH1_Conditional_Statement;

import java.util.Scanner;

public class Print_largestOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=sc.nextInt();
        if(num>=num1){
            System.out.println(num+" is greater than "+num1);
        }
        else{
            System.out.println(num1+" is greater than "+num);
        }
    }
}
