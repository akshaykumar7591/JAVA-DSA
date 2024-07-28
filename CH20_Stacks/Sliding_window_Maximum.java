package CH_20_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Sliding_window_Maximum {
    // Appoarac 1
    public static int[] maxSiliding(int arr[],int k){
        int n=arr.length;
        int ans[]=new int[n-k+1];
        int z=0;
        for(int i=0;i<n-k+1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max=Math.max(max,arr[j]);
            }
            ans[z++]=max;
        }
        return ans;
    }
    //Approach 3 - using next greater element
    public static int[] maxSiliding2(int arr[],int k){
        int n=arr.length;
        int z=0;
        int ans1[]=new int[n-k+1];
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[n];
        st.push(n-1);
        ans[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while (st.size()!=0 && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=n;
            }
            else {
                ans[i]=st.peek();

            }
            st.push(i);
        }
        for(int i=0;i<n-k+1;i++){
            int j=i;
            int max=arr[j];
            while(j<i+k){
                max=arr[j];
                j=ans[j];
            }
            ans1[z++]=max;
        }
        return ans1;
    }
    //Approach 2 - using next greater element
    public static int[] maxSiliding1(int arr[],int k){
        int n=arr.length;
        int z=0;
        int ans1[]=new int[n-k+1];
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[n];
        st.push(n-1);
        ans[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while (st.size()!=0 && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=n;
            }
            else {
                ans[i]=st.peek();

            }
            st.push(i);
        }
        int j=0;
        for(int i=0;i<n-k+1;i++){
           if(j>=i+k){
               j=i;
           }
            int max=arr[j];
            while(j<i+k){
                max=arr[j];
                j=ans[j];
            }
            ans1[z++]=max;
        }
        return ans1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ans []=maxSiliding2(arr,k);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
