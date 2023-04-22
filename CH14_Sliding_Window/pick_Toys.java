package CH14_Sliding_Window;

import java.util.HashMap;
import java.util.Scanner;

// this question is simillar to another but ther is two condition in this
// 1) we take toys in continous sequence means substring
// 2) and we take only two toys means two character
public class pick_Toys {
    public static void pickToy(String str){
        int i=0;
        int j=0;
    int n=str.length();
        int max= Integer.MIN_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<n){
            char ch=str.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
            if(map.size()<2){
                j++;
            }
            if(map.size()==2){
                max=Math.max(max,j-i+1);
                j++;

            }
            else if(map.size()>2){
                while(map.size()>2){
                    map.put(str.charAt(i),map.get(str.charAt(i))-1);
                    if(map.get(str.charAt(i))==0){
                        map.remove(str.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        pickToy(str);
    }
}
