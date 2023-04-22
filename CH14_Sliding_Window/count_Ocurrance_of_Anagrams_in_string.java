package CH14_Sliding_Window;

import java.util.HashMap;
import java.util.Scanner;

public class count_Ocurrance_of_Anagrams_in_string {
    public static int occurenceOfAnagrams(String str1,HashMap<Character,Integer> map,int sizemap,int k){
        int ans=0;
        int i=0;
        int j=0;
        int count=sizemap;  // count of character in string
//        HashMap<Character,Integer> map2=new HashMap<>();
        while(j<str1.length()){
            char ch=str1.charAt(j);
            if(map.containsKey(ch)){ // if contain then -1 from frequency
                map.put(ch,map.get(ch)-1);
                if( map.get(ch)==0){ // if key value is 0 then count--
                    count--;
                }
            }

            if(j-i+1<k){  // if length of subarray is not equal then j++
                j++;
            }
            else if(j-i+1==k){
                if(count==0){
                    ans++;
                }

                    if (map.containsKey(str1.charAt(i))) { //  when we i++ then check charAt(i) is present or not if yes
                        map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);// then frquency increase
                        count++;// count of char also increse
                    }
                i++;
                j++;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter String :");
        String str1=sc.nextLine();
//     sc.nextInt();
        System.out.println("Enter Anagram string : ");
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
