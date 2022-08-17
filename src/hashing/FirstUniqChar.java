package hashing;

import java.util.HashMap;

public class FirstUniqChar {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer>map =new HashMap<>();

        for(char c: s.toCharArray()){
           if(map.containsKey(c)){
               map.put(c,map.get(c)+1);
           }
           else{
               map.put(c,1);
           }
        }

        for (char c: s.toCharArray()){
            if(map.get(c) ==1){
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
