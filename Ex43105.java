public class Ex43105 {
    
    public static void main(String[] args) {
        
    }

    // https://school.programmers.co.kr/learn/courses/30/lessons/43105
    class Solution {
        public int solution(int[][] triangle) {
            int answer = 0;

            for(int i = triangle.length-2 ; i >= 0 ; i--){
                for(int j = 0 ; j <= i ; j++){
                    triangle[i][j] = triangle[i][j]+Math.max(triangle[i+1][j],triangle[i+1][j+1]);
                }
            }
            answer = triangle[0][0];            

            return answer;
        }
    }
}
