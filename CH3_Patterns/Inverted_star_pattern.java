package CH3_Patterns;

import java.util.Scanner;

public class Inverted_star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
