import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ex49993 {
    
    public static void main(String[] args) {
        
    }
    // https://school.programmers.co.kr/learn/courses/30/lessons/49993
    class Solution {
        public int solution(String skill, String[] skill_trees) {
            int answer = -1;
            // C -> B -> D
            
            
            HashSet<Character> kind = new HashSet<>(); 
            for(char c : skill.toCharArray()){
                kind.add(c);
            }

            for(int i = 0 ; i < skill_trees.length ; i++){
                boolean flag = true;
                int index = 0;
                // 순서 세기
                for(char c : skill_trees[i].toCharArray()){
                    int skillIdx = skill.indexOf(c);

                    if (skillIdx == -1) continue; 
                    // 포함하지 않는 문자 pass
                    else if (skillIdx == index) index++; // 올바른 순서로 스킬을 배우고 있음
                    else { // 올바르지 않은 순서로 스킬을 배우려고 함
                        flag = false;
                        break;
                    }
                }
                if(flag == true) answer++;
            }
            return answer;
        }
    }
}
