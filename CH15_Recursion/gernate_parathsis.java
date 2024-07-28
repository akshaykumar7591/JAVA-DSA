package CH_15_Recursion;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class gernate_parathsis {
    public static void parathesis(int n, int opening,int close,String ans){
        if(opening==n && close ==n){
            System.out.println(ans+" ");
            return;
        }
        if(opening<n){
            parathesis(n,opening+1,close,ans+"(");
        }
        if(close<opening){
            parathesis(n,opening,close+1,ans+")");
        }
    }
    // return in list
    public static void parathesis1(int n, int opening,int close,String ans,List<String> list){
        if(opening==n && close ==n){
            list.add(ans);
            return;
        }
        if(opening<n){
            parathesis1(n,opening+1,close,ans+"(",list);
        }
        if(close<opening){
            parathesis1(n,opening,close+1,ans+")",list);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        parathesis(n,0,0,"");
        List <String> ans=new ArrayList<>();
        parathesis1(n,0,0,"",ans);
        System.out.println(ans);
    }
}
