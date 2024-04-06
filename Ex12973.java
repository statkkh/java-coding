import java.util.Stack;

public class Ex12973 {

    public static void main(String[] args) {
        
        String s = "baabaa";
        Hint hint = new Hint();

    }
    
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12973

class Hint{
    public int solution(String s){

        // string -> 시간 초과 원인이 됨
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){

            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else{
                if(stack.peek() == s.charAt(i)){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}