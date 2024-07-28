package CH_15_Recursion;

import java.util.Scanner;

public class sum_of_natural_number_with_alternate_sign {
    public static int seriesSum(int num){
        if(num==1){
            return 1;
        }
        if(num%2==0){
            return seriesSum(num-1)-num;
        }
        return seriesSum(num-1)+num;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(seriesSum(num));
    }
}
