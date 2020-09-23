
package assignment7;

import java.util.Stack;

public class PostfixEvaluation {

    public static Double postfixEvaluation(String postfix) {
        
        Stack<Double> s = new Stack<Double>();

        char[] chars = postfix.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            if (isOperator(ch)) {
                switch (ch) {
                    case '+':
                        s.push(s.pop() + s.pop());    
                        break;
                    case '*': 
                        s.push(s.pop() * s.pop());    
                        break;
                    case '-': 
                        s.push(-s.pop() + s.pop());   
                        break;
                    case '/':
                        s.push(1 / s.pop() * s.pop()); 
                        break;
                }
            } else if(Character.isDigit(ch)) {
                s.push(0.0);
                while (Character.isDigit(chars[i]))
                    s.push(10.0 * s.pop() + (chars[i++] - '0'));
            }
        }

        if (!s.isEmpty()) 
            return s.pop();
        else
            return 0.0;
    }

    private static boolean isOperator(char ch) {
        return ch == '*' || ch == '/' || ch == '+' || ch == '-';
    }
    
     public static void main(String[] args) {
        System.out.println("Convert the expression to infix");
        String postfix = "6 13 25 + * 9 2 / -";
        Double value = postfixEvaluation(postfix);
        System.out.println(value);
    }

}
