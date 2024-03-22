import java.util.*;
public class Ex0616 {
    // 숫자 짝꿍

    public static void main(String[] args) {
        
    }

    class Solution {
        public String solution(String x, String y) {
            Map<Integer, Integer> xmap = new HashMap<>();
            Map<Integer, Integer> ymap = new HashMap<>();
            StringBuilder answer = new StringBuilder();

            for(String temp: x.split("")){
                int now = Integer.parseInt(temp);
                xmap.put(now, xmap.getOrDefault(now,0)+1);
            }   
            
            for(String temp: y.split("")){
                int now = Integer.parseInt(temp);
                ymap.put(now, xmap.getOrDefault(now,0)+1);
            }  

            for(int i = 9 ; i>=0 ; i--){
                if(xmap.containsKey(i) && ymap.containsKey(i)){
                    int count = Math.min(xmap.get(i),ymap.get(i));
                    for(int j = 0 ; j < count ; j++){
                        answer.append(i);
                    }
                }
            }

            if(answer.toString().startsWith("0")) return "0";
            if(answer.toString().equals("")) return "-1";
            
            return answer.toString();
        }
    }

}
