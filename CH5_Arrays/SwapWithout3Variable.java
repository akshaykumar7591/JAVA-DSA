package CH5_Arrays;

import java.util.Scanner;

public class SwapWithout3Variable{
    static void swap(int num,int num1){
        System.out.println("orignal value of num1: "+num);
        System.out.println("orignal value of num2: "+num1);
        num=num+num1;
        num1=num-num1;
        num=num-num1;
        System.out.println("update value of num1 : "+num);
        System.out.println("update value of num2 : "+num1);


    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 number :");
        int num=sc.nextInt();
        System.out.println("enter 2 number :");
        int num1=sc.nextInt();
        swap(num,num1);





    }


}

