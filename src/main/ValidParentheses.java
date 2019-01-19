package main;
// () return true
//"({}[]{([]})" return false
//"({}[]{([])})" return true
import java.util.Stack;

public class ValidParentheses {
	Stack<Character> stack = new Stack<Character>();
    char top;
    public boolean isValid(String s) {
        if(s.length() == 0)
            return true;
        
        for(int i= 0; i< s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else{
            	if(stack.empty())
                    return false;
                else
                     top = stack.pop();
            	
                if((top == '(' && c != ')') || (top == '{' && c != '}') ||
                		(top == '[' && c != ']')  )
                    return false;
            }
            
        }
        return(stack.isEmpty());
    }
}
