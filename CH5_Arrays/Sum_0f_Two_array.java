package CH5_Arrays;

import java.util.Scanner;

public class Sum_0f_Two_array {
    public static void getsum(int[] arr ,int[] arr1){
        int n=arr.length;
        int n1=arr1.length;
        //System.out.println(n1);
        int ans[]=new int[n1>n?n1:n];
        System.out.println(ans.length);
        int i=arr.length-1;
        int j=arr1.length-1;
        int k= ans.length-1;
        int carry=0;
        while(k>=0){
            int d=carry;
            if(i>=0){
                d+=arr[i];
            }
            if(j>=0){
                d+=arr1[j];
            }
            carry=d/10;
            d%=10;
            ans[k]=d;
            k--;
            i--;
            j--;


        }
        if(carry !=0){
            System.out.print(carry+" ");
        }
       for(int val:ans){
           System.out.print(val+" ");
       }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of arr1 :");
        int n=sc.nextInt();
        System.out.println(" enter size of arr2 : ");
        int n1=sc.nextInt();

        int arr[]=new int[n];
        int arr1[]=new int[n1];
        System.out.println("enter ele 1: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter ele 2: ");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();

        }

        getsum(arr,arr1);


    }
}
