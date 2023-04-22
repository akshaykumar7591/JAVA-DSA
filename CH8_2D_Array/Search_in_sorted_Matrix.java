package CH8_2D_Array;

import java.util.Scanner;

public class Search_in_sorted_Matrix {
    public static boolean stairCaseSearch(int arr[][],int key){
        int row=0;
        int col= arr.length-1;
        while(row<=arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.println("found");
                return true;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter key :");
        int key=sc.nextInt();
        System.out.println(stairCaseSearch(arr,key));

    }
}
