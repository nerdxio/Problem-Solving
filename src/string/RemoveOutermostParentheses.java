package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveOutermostParentheses {

    public static void main(String[] args) {
        String s  = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        char[] parenSeq = s.toCharArray();
        List<String> answer = new ArrayList<>();
        int parenCount = 0;
        for (int i = 0; i < parenSeq.length; i++) {
            char singleParen = parenSeq[i];
            if (singleParen == ')') {
                parenCount--;
                if (parenCount != 0) {
                    answer.add(Character.toString(')'));
                }
            } else {
                if (parenCount != 0) {
                    answer.add(Character.toString('('));
                }
                parenCount++;
            }
        }
        String answerA = "";
        for (String ss : answer)
            answerA = answerA + ss;
        return answerA;
    }
}
