import java.util.HashMap;
import java.util.Map;

public class Ex0816 {
    

    // https://school.programmers.co.kr/learn/courses/30/lessons/131127
    public static void main(String[] args) {
        
    }

    class Solution {
        public int solution(String[] want, int[] number, String[] discount) {
            int answer = 0;
            int days = 10;

            Map<String, Integer> map = new HashMap<>();
            
            for(int i = 0 ; i < want.length ; i++){
                map.put(want[i], number[i]);
            }
            Map<String,Integer> dmap = new HashMap<>();

            for(int i = 0 ; i < discount.length -days + 1 ; i++){
                
                for(int j = 0 ; j < days; j++){
                    dmap.put(discount[i + j], dmap.getOrDefault(discount[i+j], 0)+1);
                }

                boolean flag = true;
                // boolean flag =
                for(String key : map.keySet()){
                    if(map.get(key) != dmap.get(key)){
                        flag = false;
                        break;
                    }
                }
                answer += (flag) ? 1 : 0;
            }
            return answer;
        }
    }
}

