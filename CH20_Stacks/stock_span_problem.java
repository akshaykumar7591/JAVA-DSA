package CH_20_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class stock_span_problem {
    public static int [] stockSpan(int [] arr){
        int res[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        res[0]=1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=i+1;
            }
            else{
                res[i]=i-st.peek();
            }

            st.push(i);

        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=stockSpan(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
