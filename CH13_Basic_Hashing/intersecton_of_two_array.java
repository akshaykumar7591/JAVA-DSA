package CH13_Basic_Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class intersecton_of_two_array {
    public static void intersectionArray(int arr[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                System.out.print(arr2[i]+" ");
                set.remove(arr2[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int arr2[] = {6, 3, 9, 2, 9, 4};
        intersectionArray(arr, arr2);
    }
}
