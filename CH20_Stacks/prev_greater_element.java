package CH_20_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class prev_greater_element {
    //method 3 using  stack previous greater element
    public static int [] prevGreater(int [] arr){
        int res[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        res[0]=-1;
        st.push(arr[0]);
        for(int i=1;i<n;i++){
            while(st.size()>0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }

            st.push(arr[i]);

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
        int ans[]=prevGreater(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
