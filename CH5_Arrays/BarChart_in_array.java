package CH5_Arrays;

import java.util.Scanner;

public class BarChart_in_array {
    public static void barChart(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        for (int i = max; i>0; i--) {
            for (int j = 0; j < n; j++) {
                if (arr[j] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        barChart(arr);
    }

}
