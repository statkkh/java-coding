public class Ex42842 {
    
    public static void main(String[] args) {
        
    }
}

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        int sum = brown + yellow;
        for(int i = 3 ; i < sum ; i++){
            if(sum % i == 0){
                int row = Math.max(i, sum/i);
                int col = Math.min(i, sum/i);
                if((row-2)*(col-2) == yellow){
                    answer[0] =row;
                    answer[1] =col;
                    return answer;
                }
            }
        }
        return answer;
    }
}
