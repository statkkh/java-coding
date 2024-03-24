import java.util.HashMap;

public class Ex0708 {
    
    public static void main(String[] args) {
        
    }

    // https://school.programmers.co.kr/learn/courses/30/lessons/258712
    class Solution {
        public int solution(String[] friends, String[] gifts) {
            int answer = 0;
            
            HashMap<String, Integer> map = new HashMap<>();
            
            for(int i = 0 ; i < friends.length ; i++){
                map.put(friends[i], i);
            }

            // 지수
            int[] index = new int[friends.length];

            // 교환
            int[][] exchange = new int[friends.length][friends.length];

            for(int i = 0 ; i < gifts.length ; i++){
                String giveIdx = gifts[i].split(" ")[0];
                String getIdx = gifts[i].split(" ")[1];

                int left = map.get(giveIdx);
                int right = map.get(getIdx);


                exchange[left][right]++;
                // exchange[right][left]++;

                // 지수구하기
                index[left]++;
                index[right]--;
            }

            // 받기만 하면서 몇명에게 받았는지에 대한 횟수
            int getCount = 0;

            // 주기만 한 사람의 인덱스
            int onlyGiveIndex = 0;
            //  받기만 한 사람의 횟수
            int onlyGet = 0;

            // 준 사람 
            for(int i = 0 ; i < exchange.length ; i++ ){
                getCount = 0;
                // 받은 사람
                for(int j = 0 ; j < exchange[i].length ; j++){
                    if(i == j) continue;
                    if(exchange[i][j] > exchange[j][i]) getCount++;
                    if(exchange[i][j] == exchange[j][i] && index[i] > index[j]){
                        getCount++;
                    }
                }
                answer = Math.max(answer, getCount);
            }


            return answer;
        }
    }
}
