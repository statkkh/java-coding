import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex12939 {
    
}
class Solution {
    public String solution(String s) {
        String answer = "";
        //
        String[] numbers = s.split(" ");
        //
        int mx = Integer.parseInt(numbers[0]); 
        int mn = Integer.parseInt(numbers[0]);

        for(int i = 1 ;  i < numbers.length ;i++){
            int n = Integer.parseInt(numbers[i]);
            if(Integer.parseInt(numbers[i]) < mn) mn = Integer.parseInt(numbers[i]);
            mn = Math.min(mn, n);
            if(Integer.parseInt(numbers[i]) > mx) mx = Integer.parseInt(numbers[i]); 
            mx = Math.max(mx,n);
        }   
        answer = String.format("%d %d", mn, mx);    
        // return answer;

        // ------------------------------------------------------------------------------------------------------
        int[] nums = Arrays.stream(s.split(""))
                            .mapToInt(Integer:: parseInt)
                            .sorted()
                            .toArray();
        return nums[0] + " " + nums[nums.length-1];
    }
}