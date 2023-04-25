import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack1.isEmpty()) {
                stack1.push(s.charAt(i));
                continue;
            }
            if ((s.charAt(i) == ')' && stack1.peek() == '(') || (s.charAt(i) == '}' && stack1.peek() == '{')
                    || (s.charAt(i) == ']' && stack1.peek() == '[')) {
                stack1.pop();
            }

            else {
                stack1.push(s.charAt(i));
            }
        }
        if (!stack1.empty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}["));
    }
}
