package CH13_Basic_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class subarray_sum_equal_to_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);// empyty subarray

        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        System.out.println(ans);
    }
}
