import java.util.Random;
import java.util.Stack;

public class Ex0601 {
    
// 랜덤 숫자를 만들기
// 중복 숫자 허용, 연속은 안됨

    public static void main(String[] args) {
        int n = 10;

        int count = 0;
        Stack<Integer> stack = new Stack<Integer>();

        while(stack.size() < 10){
            // Random rand = new Random(); UUID
            int m = (int)(Math.random() * 10);
            if(stack.isEmpty()){
                stack.push(m);
            }else{
                if(stack.peek() != m){
                    stack.push(m);
                }
            }
        }
    }
}
