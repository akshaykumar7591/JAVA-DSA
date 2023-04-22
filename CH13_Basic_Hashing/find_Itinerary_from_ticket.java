package CH13_Basic_Hashing;

import java.util.HashMap;

public class find_Itinerary_from_ticket {
    public static String getstart(HashMap<String,String> map){
        HashMap<String,String > rev=new HashMap<>();
        for(String keys: map.keySet()){
            rev.put(map.get(keys),keys);
        }
        for( String keys: map.keySet()){
            if(!rev.containsKey(keys)){
                return keys;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("Chennai","Bengaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        String start=getstart(map);
        while(map.containsKey(start)){
            System.out.print(start+"->");
            start=map.get(start);
        }
        System.out.print(start);
    }
}
