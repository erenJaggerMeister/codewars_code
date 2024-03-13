import java.util.*;

public class workValidBraces {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String collBraces = sc.next();
        System.out.println(isValid(collBraces));
    }

    public static boolean isValid(String braces) {
        // Add code here
        boolean finalBooleanResult = true;
        Stack<Character> braceStack = new Stack<Character>();
        // input to stack
        for (int x = 0; x < braces.length(); x++) {
            //

            // =======================================================
            if (braceStack.isEmpty()) {
                boolean tempRes = (braces.charAt(x) == ')') || (braces.charAt(x) == ']') || (braces.charAt(x) == '}')
                        ? false
                        : true;
                if (tempRes == false) {
                    finalBooleanResult = tempRes;
                    return finalBooleanResult;
                }
            }
            if (braces.charAt(x) == '(' || braces.charAt(x) == '[' || braces.charAt(x) == '{') {
                braceStack.push(braces.charAt(x));
            } else {
                char topOfStack = braceStack.peek();
                // id top of stack == '('
                if (topOfStack == '(') {
                    // if charAt(x) from braces == ')'
                    if (braces.charAt(x) == ')') {
                        // take out the top of stack
                        braceStack.pop();
                    } else {
                        finalBooleanResult = false;
                        break;
                    }
                } else if (topOfStack == '[') { // if the top of stack is == '['
                    // if charAt(x) ==']'
                    if (braces.charAt(x) == ']') {
                        // take out the pop of stack
                        braceStack.pop();
                    } else {
                        finalBooleanResult = false;
                        break;
                    }
                } else { // if the top of stack is == '{'
                    // if charAt(x) == '}'
                    if (braces.charAt(x) == '}') {
                        // take out the pop of stack
                        braceStack.pop();
                    } else {
                        finalBooleanResult = false;
                        break;
                    }
                }
            }
        }
        if (finalBooleanResult == true) {
            boolean checkLengthStack = braceStack.isEmpty() ? true : false;
            if (checkLengthStack == true) {
                finalBooleanResult = checkLengthStack;
            } else {
                finalBooleanResult = false;
            }
        }
        return finalBooleanResult;
    }
}
