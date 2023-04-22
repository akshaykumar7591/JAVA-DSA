package CH3_Patterns;

import java.util.Scanner;

public class print_charcter_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        char c='A';
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
