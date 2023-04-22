package CH8_2D_Array;

import java.util.Scanner;

public class Digonal_Trversal {
    public static void digonalPrint(int [][]arr){
        for(int gap=0;gap<arr.length;gap++){
            for(int i=0,j=gap;j<arr.length;j++,i++){
                System.out.print(arr[i][j]+" ");
            }
        }
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
        digonalPrint(arr);
    }
}
