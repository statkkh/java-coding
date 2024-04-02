import java.util.Arrays;
import java.util.Collections;

public class Ex42883 {
    
    public static void main(String[] args) {
        
        Solution solution = new Solution();

        String s = "1924";
        System.out.println(solution.solution(s, 2));
        

    }

}
    // https://school.programmers.co.kr/learn/courses/30/lessons/42883
class Solution {
    public String solution(String number, int k) {

        int toPick = number.length() - k;
        int start = 0;
        StringBuilder sb = new StringBuilder();

        while(toPick > 0){
            int maxIndex = start;

            for( int i = 0 ; i < number.length() && i <= start + k; i++){
                if(number.charAt(maxIndex) <= number.charAt(i)){
                    maxIndex = i;
                }
            }
            sb.append(number.charAt(maxIndex));
            toPick--;
            k -= (maxIndex - start);
            start = maxIndex+1;
        }

        return sb.toString();
    }
        // Arrays.sort(answer, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));        
        //숫자를 문자열로 변환하여 이어 붙였을 때 만들어지는 가장 큰 숫자를 만드는 로직
        // String sortedString = new String(numbers);        
}

// Character[] answer = new Character[number.length()];

// for(int i = 0 ; i < number.length() ; i++){
//     answer[i] = (number.charAt(i));
// }
// Arrays.sort(answer, Collections.reverseOrder()); // 숫자가 담긴 문자를 내림차순 으로 정렬렬

// StringBuilder sb = new StringBuilder();

// for(int i = 0 ; i < number.length() - k ; i++){
//     sb.append(answer[i]);
// }