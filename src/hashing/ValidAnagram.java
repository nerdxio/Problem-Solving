package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class ValidAnagram {
    public static void main(String[] args) {
    String s =  "rat", t =  "cat";


        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }
}
