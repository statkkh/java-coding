import java.util.Arrays;
import java.util.HashSet;

public class Ex131701 {
    
    public static void main(String[] args) {
        
    }
}

class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/131701
    public int solution(int[] elements) {
        // set에 정수형 배열 선언과 동시에 삽입
        HashSet<Integer> set = new HashSet<>();
        // 더하기 횟수
        for(int i = 1 ; i <= elements.length ; i++){
            for(int j = 0 ; j < elements.length ; j++){
                int sum = 0;
                for(int k = j ; k < j+i ; k++){
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}
