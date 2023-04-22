package CH10_Binary_Search;

import java.util.Scanner;

public class search_ele_in_2D_Stair_Case {
    public static boolean search(int arr[][],int tar){
        int row=arr.length;
        int col=arr[0].length;
        int i=0;
        int j=col-1;
        while(i<row && j>=0){
            if(tar==arr[i][j]){
                return true;
            }
            else if(tar>arr[i][j]){
                i++;
            }
            else{
                j--;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int tar=sc.nextInt();
        boolean arr2=search(arr,tar);
        System.out.println(arr2);

    }
}
