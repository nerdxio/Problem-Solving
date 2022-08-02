package string;

import java.util.Arrays;

public class TruncateSentence {
    public static void main(String[] args) {
        String s ="Hello how are you Contestant";
                int k =4 ;
        System.out.println(truncateSentence(s,k));
    }

    public static String truncateSentence(String s, int k) {
        String [] stringSplit = s.split(" ");
        StringBuilder  result = new StringBuilder();

        for (int i = 0; i < k; i++) {
            result.append(stringSplit[i]);
            result.append(" ");
        }
        return result.toString().trim();
    }
}
