public class Ex12951 {
    
    public static void main(String[] args) {
        
    }
}

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        boolean flag = false;
        s = s.toLowerCase();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                flag = true;
                answer.append(' ');
            }
            else if(flag == true && (s.charAt(i) >= 'a' || s.charAt(i) <= 'z') ){
                flag = false;
                answer.append(Character.toUpperCase(s.charAt(i)));
            }else{
                answer.append(s.charAt(i));
            }


        }

        return answer.toString();
    }
}