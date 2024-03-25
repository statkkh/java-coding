import java.util.Stack;

public class Ex0802 {
    
    // https://school.programmers.co.kr/learn/courses/30/lessons/12909 올바른 괄호
    public static void main(String[] args) {
        
    }

    class Solution {
        boolean solution(String s) {
            boolean answer = false;
    
            Stack<Character> stack = new Stack<>();        
            
            for(int i = 0 ; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '('){
                    stack.push(c);
                }else{
                    if(stack.isEmpty()){
                        return answer;
                    }else{
                        stack.pop();
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
