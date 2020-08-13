import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}" ;
        String s6 = ")({[]}" ;
        String s7 = "" ;

        System.out.println("\n" +s1 +" "+ Boolean.toString(isValid(s1)));
        System.out.println("\n" +s2 +" "+ Boolean.toString(isValid(s2)));
        System.out.println("\n" +s3 +" "+ Boolean.toString(isValid(s3)));
        System.out.println("\n" +s4 +" "+ Boolean.toString(isValid(s4)));
        System.out.println("\n" +s5 +" "+ Boolean.toString(isValid(s5)));
        System.out.println("\n" +s6 +" "+ Boolean.toString(isValid(s6)));
        System.out.println("\n" +s7 +" "+ Boolean.toString(isValid(s7)));
    }

    public static boolean isValid(String s) {
        if (s.length()%2 != 0)
            return false;

        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                charStack.push(c);
            } else if((!charStack.empty()) && ((c==')' && charStack.peek() == '(') || (c=='}' && charStack.peek() == '{') || (c==']' && charStack.peek() == '['))){
                charStack.pop();
            } else {
                charStack.push(c);
            }
        }

        return (charStack.empty() ? true : false);
    }
}
