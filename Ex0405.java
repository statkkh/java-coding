import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/28278
public class Ex0405 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        
        for(int i = 0 ; i < n ; i++) {

            int k = sc.nextInt();
            if(k  == 1) {
                int s = sc.nextInt();
                stack.push(s);
            }
            if(k  == 2 ) {
                if(stack.isEmpty()) {
                    System.out.println(-1);
                }
                System.out.println(stack.peek());
                stack.pop();

            }
            if(k  == 3 ) {
                System.out.println(stack.size());
            }
            if(k == 4){
                if(stack.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(stack.peek());
                }
            }
        }
        sc.close();
    
    }
}
