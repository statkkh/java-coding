// 10845번

import java.util.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class Ex0305 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        LinkedList<Integer> queue = new LinkedList<>();
        
        int n = sc.nextInt();

        // int unconditional = -1;
        sc.close();
        sc.nextLine();

        for(int i = 0 ; i < n ;i++){
            String str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str);
            StringBuilder sb = new StringBuilder();
            String command = st.nextToken();

            switch(command){
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(queue.poll()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    // System.out.println(queue.size());
                    break;                        
                case "empty":
                    if(queue.isEmpty()){
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if(queue.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(queue.poll()).append("\n");
                    }   
                    break;
                case "back":
                    if(queue.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(queue.getLast()).append("\n");
                        // System.out.println(queue.getLast());
                    }
                    break;
                default:
                    break;    
            }
            System.out.println(sb.toString());
        }

    }

}
