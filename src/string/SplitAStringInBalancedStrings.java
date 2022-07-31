package string;

public class SplitAStringInBalancedStrings {
    public static void main(String[] args) {
        String ex = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(ex));
    }
    public static int balancedStringSplit(String s) {
        int lcounter =0 ,rcounter = 0,counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='R') rcounter++;
            else lcounter++;
            if(rcounter == lcounter) counter++;
        }
        return counter;
    }
}
