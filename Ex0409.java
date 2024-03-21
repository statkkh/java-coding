import java.util.Scanner;

public class Ex0409 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Solution solution = new Solution();
        long answer = solution.solution(str);

        sc.close();

        System.out.println(answer);
    }
}

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String list[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < list.length; i++) {
            numbers = numbers.replace(list[i],String.valueOf(i) );            
        }

        // numbers = numbers.replace("zero","0");
        // numbers = numbers.replace("one","1");            
        // numbers = numbers.replace("two","2");
        // numbers = numbers.replace("three","3");
        // numbers = numbers.replace("four","4");
        // numbers = numbers.replace("five","5");
        // numbers = numbers.replace("six","6");
        // numbers = numbers.replace("seven","7");
        // numbers = numbers.replace("eight","8");
        // numbers = numbers.replace("nine","9");
        
        answer = Long.parseLong(numbers);
        return answer;
    }
}
