package CH4_Function;
import java.util.Scanner;


public class nPr_Calculation {
    public static int fact(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f=f*i;

        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nPr=fact(n)/fact(n-r);
        System.out.println(nPr);
    }
}
