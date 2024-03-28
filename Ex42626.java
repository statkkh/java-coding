import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

public class Ex42626 {

    public static void main(String[] args) {
        
    }   
    // https://school.programmers.co.kr/learn/courses/30/lessons/42626
    class Solution {
        public int solution(int[] scoville, int K) {
            int answer = 0;
            
            PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

            for(int i = 0 ; i < scoville.length ; i++){
                heap.add(scoville[i]);
            }            

            while(heap.peek() < K){

                int m1 = heap.poll();
                int m2 = heap.poll();

                int sum = m1 + m2*2;
                heap.add(sum);
                answer++;

                if(heap.peek() >= K) break;
                if(heap.size()==1 && heap.peek() < K) {
                    answer = -1;
                    break;
                }
            }
            return answer;
        }
    }
}
