public class Ex12980 {
    
    // https://school.programmers.co.kr/learn/courses/30/lessons/12980

    public static void main(String[] args) {
        
        Solution solution = new Solution();
        System.out.println(solution.solution(7));
    }
}


class Solution {
    public int solution(int n) {
        int count = 0;

        while(n!=1){

            if(n%2 == 0) n/=2;
            else{
                count++;
                n--;
            }
        }


        return ++count;
    }
}