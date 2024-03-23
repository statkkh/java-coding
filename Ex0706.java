import java.util.HashMap;
import java.util.Map;

public class Ex0706 {
    
    public static void main(String[] args) {
        
    }

    // https://school.programmers.co.kr/learn/courses/30/lessons/176963 추억 점수
    class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> score = new HashMap<>();
        for(int i = 0 ; i < name.length ; i++){
            score.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < photo.length ; i++){
            String[] person = photo[i];
            for(int j = 0; j < person.length ; j++){
                if(score.containsKey(person[j])){
                    answer[i] += score.get(person[j]);
                }                
            }
            // answer[i] = tmp;
        }
        
        return answer;
    }
}
}
