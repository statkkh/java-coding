import java.util.Stack;

public class Ex12973 {

    public static void main(String[] args) {
        
        String s = "baabaa";
        Hint hint = new Hint();
                
    }
    
}

class Hint{
    public int solution(String s){

        String[] str = s.split("");

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