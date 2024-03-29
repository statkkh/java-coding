import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex42584 {
    
    class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];

            answer[prices.length] = 0;
                
            Queue<Integer> q = new LinkedList<>();

            int index = 0;
            // queue에 모든 값 집어 넣기
            while(!q.isEmpty()){

                int front = q.poll();

                for(int i = prices.length - (q.size()) ; i < prices.length ; i++){

                    if(prices[i] >= front){
                        answer[index]++;
                    }

                    if(prices[i] < front){
                        answer[index]--;
                    }
                }
                index++;
            }

            return answer;
        }
    }
}
