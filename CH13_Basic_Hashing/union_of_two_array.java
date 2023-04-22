package CH13_Basic_Hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class union_of_two_array {
    public static void unionArray(int arr[],int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int arr2[]={6,3,9,2,9,4};
        unionArray(arr,arr2);
    }
}
