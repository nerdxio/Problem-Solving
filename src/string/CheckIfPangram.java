package string;

import java.util.HashMap;
import java.util.HashSet;

public class CheckIfPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] mark = new boolean[26];
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char current = sentence.charAt(i);
            if (current >= 'A' && current <= 'Z') {
                index = current - 'A';
            } else if (current >= 'a' && current <= 'z') {
                index = current - 'a';
            }
            mark[index] = true;
        }

        for (boolean i : mark)
            if(i)
                flag = true ;
        else{
            flag =false;
            break;
            }

        return flag;
    }
}
