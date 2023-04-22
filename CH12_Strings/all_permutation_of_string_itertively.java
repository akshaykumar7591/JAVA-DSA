package CH12_Strings;

import java.util.Scanner;

public class all_permutation_of_string_itertively {
    public static int fact(int n){
        if(n==0 || n==1 ){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void solution(String str){
        int n=str.length();
        int factorial=fact(n);
        for(int i=0;i<factorial;i++){
            StringBuilder sb=new StringBuilder(str);
            int temp=i;
            for(int j=n;j>0;j--){
                int r=temp%j;
                temp/=j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        solution(str);
    }
}
