import java.util.Scanner;

public class Ex0406 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String result;
        // result = Solution(a,b);

        Solution solution = new Solution();
        result = solution.solution(a, b);
        System.out.println(result);
        
    }
}

class Solution {
    public static String solution(String bin1, String bin2) {

        
        int decimal1 = Integer.parseInt(bin1, 2); // 이진수 표현
        int decimal2 = Integer.parseInt(bin2, 2);        
        int sum = decimal1 + decimal2;

        String answer = Integer.toBinaryString(sum);        
        return answer;
    }
}