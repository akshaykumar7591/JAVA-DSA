package CH5_Arrays;

import java.util.Scanner;

public class differnce_of_two_array {
    public static void getsub(int[] arr, int[] arr1){
        int n=arr.length;
        int n1=arr1.length;
        //System.out.println(n1);
        // in this size of arr1 is greater than arr
        int ans[]=new int[n1];
//        System.out.println(ans.length);
        int i=arr.length-1;
        int j=arr1.length-1;
        int k= ans.length-1;
        int carry=0;
        while(k>=0){
            int d=0;
            int aiv=i>=0?arr[i]:0;
            if(arr1[j]+carry>=aiv){
                d=arr1[j]+carry-aiv;
                carry=0;

            }
            else{
                d=arr1[j]+carry+10-aiv;
                carry=-1;

            }
            ans[k]=d;
            i--;
            j--;
            k--;

        }
       // this is for if 0 come in first then not print
        int idx=0;
        while(idx<ans.length){
            if(ans[idx]==0){
                idx++;
            }
            else{
                break;
            }
        }
        for(int l=idx;l<ans.length;l++){
            System.out.print(ans[l]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
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

        getsub(arr,arr1);

    }
}
