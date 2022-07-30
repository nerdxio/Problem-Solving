package string;

public class GoalParserInterpretation {
    public String interpret(String command) {
        String result = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                result = result + "o";
            } else if (command.charAt(i) == '(' || command.charAt(i) == ')') {

            } else {
                result = result + command.charAt(i);
            }

        }
        return result;
    }
}
