package CH10_Binary_Search;

import java.util.Scanner;

public class binary_Search_In_recurrsive_Way {
    public static void recursive(int[] arr, int st, int end, int d) {

        if (st > end) {
            System.out.println("not found");
            return;
        }
        int mid = st + (end - st) / 2;
        if (d == arr[mid]) {
            System.out.println("found");
            return;
        } else if (d > arr[mid]) {
            recursive(arr, mid + 1, end, d);
        } else {
            recursive(arr, st, mid - 1, d);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target : ");
        int d = sc.nextInt();
        recursive(arr, 0, n - 1, d);
    }
}
