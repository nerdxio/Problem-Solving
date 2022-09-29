package string;

import java.util.HashMap;
import java.util.HashSet;

public class RansomNote {
    public static void main(String[] args) {
     String   ransomNote = "fbabacbcaf", magazine = "aaabbbccff";
        System.out.println(canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer>map = new HashMap<>();

        for(char c:magazine.toCharArray()){
            map.put(c ,map.getOrDefault(c,0) + 1);
        }

        for(char s :ransomNote.toCharArray()){
            if(!map.containsKey(s) || map.get(s) <=0) return false;
            map.put(s,map.get(s)-1);
        }

        return true;
    }
}
