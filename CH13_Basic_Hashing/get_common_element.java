package CH13_Basic_Hashing;

import java.util.HashMap;

public class get_common_element {
    public static void main(String[] args) {
        int arr1[]={1,1,2,2,2,3,5};
        int arr2[]={1,1,1,2,2,4,5};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }
            else{
                map.put(arr1[i],1);
            }
        }
        for(int val: arr2){
            if( map.containsKey(val) && map.get(val)>0){
                System.out.print(val+" ");
               map.put(val,map.get(val)-1) ;
            }
        }
    }
}
