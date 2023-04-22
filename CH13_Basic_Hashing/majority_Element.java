package CH13_Basic_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class majority_Element {
    public static void majority_Element(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key+" ");

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        majority_Element(arr);
    }
}
