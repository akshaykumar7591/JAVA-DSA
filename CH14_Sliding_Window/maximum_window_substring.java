package CH14_Sliding_Window;

import java.util.HashMap;
import java.util.Scanner;
// __________________________________________________________________
 /////  ------------------------- NOT COMPLETED------------------------------
// _____________________________________________________________________________
public class maximum_window_substring {
    public static int occurenceOfAnagrams(String str1, HashMap<Character,Integer> map, int sizemap, int k){
        int ans=0;
        int i=0;
        int j=0;
        int count=sizemap;  // count of character in string
        int min=Integer.MIN_VALUE;
//        HashMap<Character,Integer> map2=new HashMap<>();
        while(j<str1.length()){
            char ch=str1.charAt(j);
            if(map.containsKey(ch)){ // if contain then -1 from frequency
                map.put(ch,map.get(ch)-1);
                if( map.get(ch)==0){ // if key value is 0 then count--
                    count--;
                }
            }

            if(count>0){  // if length of subarray is not equal then j++
                j++;
            }
//             else if(count==0){
//                min=Math.min(min,j-i+1);
//                j++;
//            }
            else if(count==0){
//                min=Math.max(min,j-i+1);
                while (count==0) { //  when we i++ then check charAt(i) is present or not if yes
                    if(map.containsKey(str1.charAt(i))) {
                        if (map.get(str1.charAt(i)) < 0) {
                            map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);// then frquency increase
                            i++;
                        }
                        else{
                            min=Math.max(min,j-i+1);
                            map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
                            count++;// count of char also increse
                            i++;
                        }
                    }
                    else{
                        i++;
                    }
                }
//                min=Math.max(min,j-i+1);
                j++;

            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter String :");
        String str1=sc.nextLine();
//     sc.nextInt();
        System.out.println("Enter comparing  string : ");
        String str=sc.nextLine();
        int k=str.length();
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
        int sizemap=map.size();
        int ans=occurenceOfAnagrams(str1,map,sizemap,k);
        System.out.println(ans);
    }
}
