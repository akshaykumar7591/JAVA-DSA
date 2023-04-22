package CH9_Divide_And_Conquer_Algorithms;

import java.util.Scanner;
// give an array where all its element are in sorted in increasing order except two swapped element sort in the liner time .
// Assume there is no duplicate element in array
public class swapped_2ele_in_array_nonCorrect_postion {
    public static void sortArr(int[] arr){
        int n=arr.length;
        int x=-1,y=-1;
        if(n<=1){
            return ;
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1) {
                    x = i - 1;
                    y = i;
                }
                else{
                    y=i;
                }
            }

        }
        int temp =arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortArr(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
