public class ctrlz {
    
    public static void main(String[] args) {
        
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] list = s.split(" ");
        
        for(int i = 0 ; i < list.length ; i++){
            if(list[i].equals("Z")){
                answer -= Integer.parseInt(list[i-1]);
                continue;
            }
            answer += Integer.parseInt(list[i]);
        }
        return answer;
    }
}