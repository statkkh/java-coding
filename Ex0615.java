import java.util.*;


class Solution {
    public String solution(String s, String skip, int index) {
        ArrayList<Character> list = new ArrayList();
        for(int i = 0 ; i < 26; i++){
            list.add((char)('a' + i));
        }
        StringBuilder answer = new StringBuilder();
        
        for(Character ch : skip.toCharArray()){
            list.remove(ch);
        }
        
        
        for(Character ch : s.toCharArray()){
            // 결과값에 담을 인덱스 찾기
            int nextIndex = list.indexOf(ch);
            nextIndex = (nextIndex + index) % list.size();
            answer.append(list.get(nextIndex));
        }
        return answer.toString();
    }
}