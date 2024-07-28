package CH_20_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class next_greater_element {
    // Method 1 using arr
    public static int [] nextGreater(int []arr){
        int [] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=-1;
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    res[i]=arr[j];
                    break;
                }
            }
        }
        return res;
    }
    //method 2 using  stack next greater element
    public static int [] nextGreater2(int [] arr){
        int res[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
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
    //method 3 using  stack previous greater element
    public static int [] prevGreater(int [] arr){
        int res[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
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
        int ans[]=nextGreater2(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
