
public class Ex12904 {
    
    public static void main(String[] args) {
        

    }

    class Solution{
        public int solution(String s){
            int answer = 1;
            if(s.length() < 1) return 0;
            if(s.length() == 1) return answer;

            for(int i = 0 ; i < s.length()-1 ; i++){
                for(int j = s.length()-1 ; j >= i; j--){
                    if(isCheck(i, j,s)) answer = Math.max(answer, j-i+1);
                }
            }
            return answer;
        }
        // https://school.programmers.co.kr/learn/courses/30/lessons/12904?language=java
        boolean isCheck(int left,int right,String s){
            boolean flag = true;
            // two pointer
            while(left < right){
                if(s.charAt(left) != s.charAt(right)) return false; 
                left++;
                right--;
            }

            return flag;
        }

    }
}
