
import java.util.Stack;

public class Inifix {

    public static int precedence(char op) {
        if (op == '+' || op == '-')
            return 1;
        if (op == '*' || op == '/')
            return 2;
        return -1;
    }

    public static int applyOperation(char operant, int v1, int v2) {
        switch (operant) {
            case '+':
                return v1 + v2;
            case '-':
                return v1 - v2;
            case '*':
                return v1 * v2;
            case '/':
                return v1 / v2;

        }
        return 0;
    }

    public static void main(String[] args) {
        
        String str = "9-(6+3)*4/6";

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                val.push(ch - '0');
            } else if( ch=='('){
                op.push(ch);
            }
            else if( ch==')'){
                while( !op.isEmpty() && op.peek() != '('){
                     int v2 = val.pop();
                    int v1 = val.pop();
                    char operant = op.pop();
                    val.push(applyOperation(operant, v1, v2));


                }
                op.pop();
            }
            
            
            else {
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operant = op.pop();
                    val.push(applyOperation(operant, v1, v2));
                }

                op.push(ch);
            }

        }
        while (!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            char operant = op.pop();
            val.push(applyOperation(operant, v1, v2));
        }

        System.out.println(val.pop());

    }

}
