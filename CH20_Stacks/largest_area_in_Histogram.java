package CH_20_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class largest_area_in_Histogram {
    public static int largestArea(int [] height){
        int n=height.length;
        Stack <Integer> st=new Stack<>();
        int[] nse=new int[n];
        int []pse=new int[n];
        //calculate nse
        nse[n-1]=n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && height[st.peek()]>=height[i]){
                st.pop();
            }
            if(st.size()==0){
                nse[i]=n;
            }
            else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        //for empty current stack for reuse pse
        while(st.size()>0){
            st.pop();
        }
        // calculate pse
        pse[0]=-1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && height[st.peek()]>=height[i]){
                st.pop();
            }
            if(st.size()==0){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        //max area calculation
        int max=-1;
        for(int i=0;i<n;i++){
            int area=height[i]*(nse[i]-pse[i]-1);
            max=Math.max(max,area);
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=largestArea(arr);
        System.out.println(ans);
    }
}
