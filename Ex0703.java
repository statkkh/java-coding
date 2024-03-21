import java.util.*;
class Solution {
    public String solution(String x, String y) {
        StringBuilder answer = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(Character ch : x.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int size = 0;
        for(Character ch : y.toCharArray()){
            if(map.containsKey(ch)){
                size++;
            }
        }
        if(size < 1) answer.append("-1");
        int index = 0;
        Character[] chars = new Character[size-1];
        for(Character ch : y.toCharArray()){
            if(map.containsKey(ch)){
                chars[index++] = ch;      
            }
        }
        Arrays.sort(chars, Collections.reverseOrder());
        for (Character c : chars) {
            answer.append(c);
        }        
        return answer.toString();
    }
}