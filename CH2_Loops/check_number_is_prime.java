package CH2_Loops;

import java.util.Scanner;

public class check_number_is_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean ans=true;

        if(num==2){
            System.out.println("numbervis prime ");
        }
        else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    ans=false;
                }
            }
            if(ans){
                System.out.println("number is prime");
            }
            else{
                System.out.println("number is not prime");
            }
        }

    }
}
