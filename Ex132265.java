import java.util.HashSet;
import java.util.*;

public class Ex132265 {
    
    public static void main(String[] args) {
        
    }

    // https://school.programmers.co.kr/learn/courses/30/lessons/132265
    
}

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        Set<Integer> lset = new Set<>();
        Set<Integer> rset = new Set<>();

        int[] first = new int[topping.length];
        int[] second = new int[topping.length];

        int len = topping.length - 1;
        for(int i = 0 ; i < topping.length ; i++){

            lset.add(topping[i]);
            first[i] = lset.size();

            rset.add(topping[len-i]);
            second[i] = rset.size();
        }

        for(int i = 0 ; i <= len ; i++){

            // Why 조건 확인
            if(first[i] == second[i+1]){
                answer++;
            }
        }

        
        return answer;
    }
}
