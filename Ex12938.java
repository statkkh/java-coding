public record Ex12938() {
    
    public static void main(String[] args) {
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12938  
class Solution {
    public int[] solution(int n, int s) {
        if(n > s) {
            return new int[]{-1}; 
        }
        int[] answer = new int[n];
        int mod = s % n; // 몫
        int num = s / n; // 나머지
        for(int i = answer.length - 1 ; i >= 0 ; i--){
            // 뒤에서 부터 순회
            if(mod > 0){
                answer[i]=1; 
                --mod; // 나머지 빼기
            }
            answer[i] += num;
        }        
        return answer;
    }
}
