public class Ex0709 {
    
    // https://school.programmers.co.kr/learn/courses/30/lessons/250137
    public static void main(String[] args) {
        
    }

    class Solution {
        public int solution(int[] bandage, int health, int[][] attacks) {
            int answer = health;
            // 연속 성공
            // int attack = 0;
            int success = 0;
            // 다음 공격 인덱스
            int index = attacks[0][0];
            
            // 최대 획보량
            for(int i = 1 ; i <= attacks[attacks.length-1][0] ; i++ ){
                
                // 공격 당할 때
                if(attacks[index][0] == i ){
                    answer -= attacks[index][1];
                    success = 0;
                    // 다음 공격 위치로 이동
                    index++;
                    if(answer <= 0) return -1; //
                }else{
                    success++;
                    if(success == bandage[0]){
                        answer += bandage[2]; //
                        answer = Math.min(health, ++answer);
                        success = 0;
                    }
                    answer = Math.min(health, answer + bandage[1] );
                }
            }
            // if(answer <= 0) answer = -1;
            return answer <= 0 ? -1 : answer;
        }
    }
}
