package string;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int result = 0;
        int depth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                result = Math.max(result, ++depth);
            } else if (c == ')') {
                depth--;
            }
        }

        return result;
    }
}
