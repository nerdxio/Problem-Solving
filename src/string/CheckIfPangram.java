package string;

import java.util.HashMap;
import java.util.HashSet;

public class CheckIfPangram {
    public static void main(String[] args) {
        String  sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        boolean [] str = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) >=65 &&sentence.charAt(i) <=122){
                str[i] = true;
            }
        }
        for (int i = 0; i < str.length; i++) {
            if(str[i] == false)
                return false;
        }
        return true;
    }
}
