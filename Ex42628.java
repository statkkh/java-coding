import java.util.Collections;
import java.util.PriorityQueue;

public class Ex42628 {
    
    public static void main(String[] args) {
        
        Solution solution = new Solution();
        String [] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        System.out.println(solution.solution(operations));
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/42628
class Solution {
    // 
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        // 두개의 큐 사용
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());

        for(String s : operations) {
            String firstValue = s.split(" ")[0];
            String secondValue = s.split(" ")[1];
            
            if(firstValue.equals("I")) {
                minQ.offer(Integer.parseInt(secondValue));
                maxQ.offer(Integer.parseInt(secondValue));
            }else {
                if(secondValue.equals("1") && maxQ.size() > 0) {
                    minQ.remove(maxQ.poll());//요소 꺼냄과 동시 다른 큐에  동일한 요소 제거
                }else {
                    if(minQ.size() > 0)  maxQ.remove(minQ.poll());
                }
            }
        }
        if(minQ.size() > 0) answer[1] = minQ.poll();
        if(maxQ.size() > 0) answer[0] = maxQ.poll();
                
        return answer;
    }
}