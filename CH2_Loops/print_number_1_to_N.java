package CH2_Loops;

import java.util.Scanner;

public class print_number_1_to_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int counter=1;
        int num=sc.nextInt();
        while(counter<=num){
            System.out.print(counter+" ");
            counter++;
        }
    }
}
