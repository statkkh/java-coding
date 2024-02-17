import java.util.*;

public class CreateMaximumValue {
    
    public static void main(String[] args) {
        
    }
}


class Solution {
    public int solution(int[] numbers) {
        // int answer = 0;
        int a,b;
        Arrays.sort(numbers);
        a = numbers[0] *numbers[1]; 
        b = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        return a > b ? a:b;
    }
}