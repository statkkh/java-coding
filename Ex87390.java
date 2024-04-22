public class Ex87390 {
    
    public static void main(String[] args) {
        
        
    }
    // https://school.programmers.co.kr/learn/courses/30/lessons/87390 
    class Solution {
        public int[] solution(int n, long left, long right) {
            int[] answer = new int[(int) (right-left+1)];
            int index = 0;
            for(long i = left ; i <= right ; i++){
                long row = (i / n + 1);
                long col = (i % n + 1);
                answer[index++] = (int) Math.max(row, col); 
            }
            return answer;
        }
    }
}
