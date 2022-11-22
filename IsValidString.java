import java.util.Stack;
public class IsValidString {
    public boolean isValid(String s){
        if(s.isEmpty()){
            return true;
        }

        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(ch[i] == '(' || ch[i] =='[' || ch[i] == '{'){
                stack.push(ch[i]);
            }
            if (ch[i] == '}' ) {
                if(stack.isEmpty() || stack.pop() != '{'){
                    return false;
                }

            }
            if (ch[i] == ']' ) {
                if(stack.isEmpty() || stack.pop() != '['){
                    return false;
                }

            }
            if (ch[i] == ')' ) {
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }

            }


        } return stack.isEmpty();

    }
}
