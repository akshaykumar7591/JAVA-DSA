package CH10_Binary_Search;

import java.util.Scanner;

public class Find_square_root {
    public static float squareRoot(int d,int precision){
        int st=0;
        int end=d;
        double  root=0.0;
        while(st<=end){
            int mid =st+(end-st)/2;
            int x=mid*mid;
            if(d==x){
                root = mid;
                return (float)root;
            }
            else if(d>x){
                root=mid;
                st=mid+1;
            }
            else{

                end=mid-1;
            }
        }

        double num=0.1;
        for(int i=0;i<precision;i++) {
            while (root * root <= d) {
                root += num;
            }

            root -= num;
            num/=10;
        }
        return (float)root;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number those find square root  : ");
        int d = sc.nextInt();
        System.out.println("enter number of precision :");
        int precision=sc.nextInt();
        float squ=squareRoot(d,precision);
        System.out.println("square root is "+squ);
    }
}
