package bai10_stack_queue.bai_tap.is_bracket;

import java.util.Stack;

public class IsBracket {
    public static void main (String [] args) {
        String str1 = "s * (s – a) * (s – b) * (s – c)";
        String str2 = "s * (s – a) * (s – b * (s – c)";

        System.out.println(str1 + " --> " + checkBracket(str1));
        System.out.println(str2 + " --> " + checkBracket(str2));
    }

    public static boolean checkBracket(String check) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < check.length(); i++) {
            char let = check.charAt(i);
            if(let == '[' || let == '{' || let == '(')
                stack.push(let);
            else if(let == ']' || let == '}' || let == ')') {
                if(stack.empty())
                    return false;
                switch(let){
                    // check ngoặc vuông
                    case ']':
                        if (stack.pop() != '[')
                            return false;
                        break;
                    // check ngoặc nhọn
                    case '}':
                        if (stack.pop() != '{')
                            return false;
                        break;
                    // check ngoặc tròn
                    case ')':
                        if (stack.pop() != '(')
                            return false;
                        break;
                    default:
                        break;
                }
            }
        }
        return stack.empty();
    }
}
