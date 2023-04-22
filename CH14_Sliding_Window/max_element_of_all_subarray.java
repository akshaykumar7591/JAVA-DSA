package CH14_Sliding_Window;

import java.util.ArrayList;
import java.util.Scanner;

public class max_element_of_all_subarray {
public static void maxElement(int[] arr, int k) {
    int n = arr.length;
    int i = 0;
    int j = 0;
    ArrayList<Integer> list = new ArrayList<>();// create list of storing max element in subarray
    ArrayList<Integer> ans = new ArrayList<>();// for storing ans from list
    while (j < n) {
        int back = list.size() - 1;
        while (list.size() > 0 && back >= 0 && list.get(back) <= arr[j]) { // if all previous element is smaller than arr[j]
            list.remove(back);// then delete till previous is greater than arr[j]
            back--;
        }
        list.add(arr[j]); // after delete add arr[j]
        if (j - i + 1 < k) { // increase length till reach k
            j++;
        } else if (j - i + 1 == k) {
            ans.add(list.get(0)); // add list element in ans list becaur element store in first index
            if (arr[i] == list.get(0)) { // before i++ check they are equal
                list.remove(0); // delete
            }
            i++;
            j++;
        }
    }
    System.out.println(ans);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("size of window ");
        int k=sc.nextInt();
        maxElement(arr,k);
    }
}
