import java.util.Arrays;

public class Ex12941 {
    
    public static void main(String[] args) {
        
        Solution solution = new Solution();

        int []a = {1, 4, 2};
        int []b = {5, 4, 4};

        System.out.println(solution.solution(a,b));
    }
}
class Solution{
    public int solution(int []A, int []B){
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0 ; i < A.length ; i++){
            answer += A[i]*B[A.length-i-1];
        }
        return answer;
    }
}

