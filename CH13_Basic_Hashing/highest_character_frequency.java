package CH13_Basic_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class highest_character_frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        char max=str.charAt(0);
        for(char keys: map.keySet()){
            if(map.get(keys)>map.get(max)){
                max=keys;
            }
        }
        System.out.println(max);
    }
}
