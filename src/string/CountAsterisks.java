package string;

import java.util.Stack;

public class CountAsterisks {
    public static void main(String[] args) {

    }
    public  int countAsterisks(String s) {
        int ans = 0;
        boolean isValidPair = false;

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)=='|'){
                isValidPair = !isValidPair;
            }
            if(s.charAt(i) == '*' && isValidPair == false){
                ans++;
            }
        }
        return ans;
    }
}
