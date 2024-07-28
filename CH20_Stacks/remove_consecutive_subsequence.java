package CH_20_Stacks;

import javax.swing.text.Style;
import java.util.Scanner;
import java.util.Stack;

public class remove_consecutive_subsequence {
    public static int [] remove(int [] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++) {
            if (st.size() == 0 || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (st.peek()==arr[i]) {
                if (i == n-1 ||  arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }

        }
        int []res=new int[st.size()];
        int m=res.length;
        for(int i=m-1;i>=0;i--){
            res[i]=st.pop();
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
        int ans[]=remove(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
