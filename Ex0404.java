import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/1874

public class Ex0404 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        sc.close();
        int top = 0;
        while(n > 0){
            int m = sc.nextInt();
            if(m > top) {
                for(int i = top + 1; i <= m ; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                top = m;
            }
            
            if(stack.peek() != m){
                sb.append("No").append("\n");
                return;
            }
            
            stack.pop();
            sb.append("-").append("\n");

            n--;
        } 


    }
}