import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ex178870 {
 
    public static void main(String[] args) {
        
    }
}

class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/178870
    public int[] solution(int[] sequence, int k) {
        int sum = 0;
        int start = 0,end = 0 ;
        int len = sequence.length;
        int right = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < len ; i++){
            while(sum < k && right < len){
                sum += sequence[right++];
            }
            if(sum == k){
                int range = right - i - 1;
                if( end-start > range){ 
                    start = i;
                    end = right - 1;
                }
            }
            sum -= sequence[i];
        }
        
        List<Integer>keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        int[] answer = {start, end};
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/178870