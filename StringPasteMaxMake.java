import java.util.Arrays;

public class StringPasteMaxMake {
    
    public static void main(String[] args) {
        
        
        // Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
    }
}

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        int zeroCount = 0;
        for(int i = 0 ; i < numbers.length ; i++){

            while(numbers[i] % 10 ==0){
                numbers[i]/=10;
                zeroCount++;
            }
        }
        Arrays.sort(numbers);

        String[] arr = new String[numbers.length];

        //숫자를 문자열로 변환하여 이어 붙였을 때 만들어지는 가장 큰 숫자를 만드는 로직
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        String result = answer.reverse().toString();
        // Arrays.sort(arr, (o1, o2) -> (o1 + o2).compareTo(o1 + o2));
        return result;
    }
}