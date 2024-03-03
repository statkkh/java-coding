import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

//www.acmicpc.net/problem/10828
//  StringBuilder : String을 합치는 작업 시 하나의 대안

public class Ex0404 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str);
            String cmd = st.nextToken(); // 공백 기준 앞 뒤 자르기

            switch (cmd) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case "pop":
                    if(stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(stack.pop()).append("\n");
                    }
                    stack.pop();
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if(stack.isEmpty()){
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                    break;
                case "top":
                    if(stack.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(stack.peek()).append("\n");

                    }
                    break;                

                default:
                    break;
            }
        }
        System.out.println(sb.toString());
        sc.close();

    }
}
