import java.util.Scanner;

public class Ex0408 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution solution = new Solution();
        
        str = solution.solution(str);
        sc.close();

        System.out.println(str);
    }

}


class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for(char c : my_string.toCharArray()){
            answer.append((c-0)>=97 ? (char)(c-32) : (char)(c+32)) ;
        }        
        return answer.toString();
    }
}
