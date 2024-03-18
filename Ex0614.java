import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        StringBuilder answer = new StringBuilder();
        
        Map<String, Integer> map = new HashMap<>();
        
        // getOrDefault : value에 기본 값넣기
        for(String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        for(String name : completion) {
            map.put(name, map.get(name) - 1);
        }
        
        for(String name : participant){
            if (map.get(name) > 0) {
                answer.append(name);
                break;
            }
        }
        
        return answer.toString();
    }
}


