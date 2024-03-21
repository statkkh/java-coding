import java.util.*;
public class Ex0702 {

    // 둘만의 암호
    // https://school.programmers.co.kr/learn/courses/30/lessons/155652 
    public static void main(String[] args) {
        
    }
    class Solution {
        public String solution(String s, String skip, int index) {
            ArrayList<Character> list = new ArrayList<>();
            for(int i = 0 ; i < 26; i++){
                list.add((char)('a' + i));
            }
            StringBuilder answer = new StringBuilder();
            
            for(Character ch : skip.toCharArray()){
                list.remove(ch);
            }
            
            
            for(Character ch : s.toCharArray()){
                int nextIndex = list.indexOf(ch);
                nextIndex = (nextIndex + index) % list.size();
                answer.append(list.get(nextIndex));
            }
            return answer.toString();
        }
    }
}
