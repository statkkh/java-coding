import java.util.HashMap;
import java.util.Map;

public class Ex0610 {
    
    public static void main(String[] args) {
        
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int max = 0;
        int min = 0;
        int [] rank = {6,6,5,4,3,2,1};

        for(int i = 0 ; i < lottos.length ; i++){
            // 0 인 숫자만 max 에 올린다
            if(lottos[i] == 0){
                max++;
                continue;
            }
            // lottos == win_nums가 같으면 max와 min 값을 올린다.
            for(int j = 0 ; j < win_nums.length ; j++){
                if(lottos[i] == win_nums[j]){
                    max++;
                    min++;
                }
            }
        }
        answer[0] = rank[max];
        answer[0] = rank[min];
        return answer;
    }    
}


