package CH13_Basic_Hashing;

import java.util.HashMap;

public class longest_consecutive_sequence {
    public static void main(String[] args) {
        int arr[]={ 10,5,9,1,11,8,6,15,3,12,2};
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int val :arr){
            map.put(val,true);
        }
        for(int val: arr){
            if(map.containsKey(val-1)){
                map.put(val,false);
            }
        }
        int start=0;
        int maxlen=0;
        for(int val :arr){
            if(map.get(val)==true){
                int startele=val;
                int len=1;
                while(map.containsKey(val+len)){
                    len++;
                }
                if(len>maxlen){
                    maxlen=len;
                    start=startele;
                }
            }
        }
        System.out.println(start+" "+maxlen);

    }
}
