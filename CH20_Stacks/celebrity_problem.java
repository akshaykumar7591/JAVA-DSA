package CH_20_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class celebrity_problem {
    public static int  celebrity(int arr[][],int n){

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while (st.size()>1){
            int v1=st.pop();
            int v2=st.pop();
            if(arr[v1][v2]==0){
                st.push(v1);
            }
            else if(arr[v2][v1]==0){
                st.push(v2);
            }
        }
        if(st.size()==0){
            return -1;
        }
        int potentia=st.pop();
        for(int i=0;i<n;i++){
            if(arr[potentia][i]==1){
                return -1;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i][potentia]==0){
                return -1;
            }
        }
        return potentia;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 arr[i][j]=sc.nextInt();
            }
        }
        int ans=celebrity(arr,n);
        System.out.println(ans);
    }
}
