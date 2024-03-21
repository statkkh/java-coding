public class Ex0400 {
    public static void main(String[] args) {
        
    }


}

class Solution {
    public int solution(int n) {
        int count = 0;
        for(int i = 1; i <= n ; i++){
            if(i % 3 == 0 || String.valueOf(i).contains("3")){
                n++;
            }
        }
        count = n;
        return count;
    }
}