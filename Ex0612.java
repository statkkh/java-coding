public class Ex0612 {
    
    public static void main(String[] args) {
        
    }
    class Solution {
        public int solution(String t, String p) {
            int answer = 0;
            
            for(int i = 0 ; i <= t.length()-p.length(); i++){
    //          Long n = Long.parserLong(t.substring(i, i+p.length()));
    //          if( n <= Long.parserLong(p)) answer++;   
                String s = t.substring(i, i+p.length());
                if(s.compareTo(p) <= 0) answer++;
            }
            return answer;
        }
    }

}
