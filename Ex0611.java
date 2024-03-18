import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 개인정보 수집 유효기간
public class Ex0611 {
    
    public static void main(String[] args) {
        
    }

    class Solution {
        public int[] solution(String today, String[] terms, String[] privacies) {
            // A : 6 B : 12 C : 3
            List<Integer> list = new ArrayList<>();
            HashMap<String, Integer> map = new HashMap<>();
            for(int i = 0 ; i < terms.length ; i++){
                map.put(terms[i].split(" ")[0], Integer.parseInt(terms[i].split(" ")[1]));
            }

            int todays = 0;
            // 
            int year = (Integer.parseInt(today.split("\\.")[0])-2000)*12*28;
            // int year = Integer.parseInt(today.split("\\.")[0]); 
            int month = Integer.parseInt(today.split("\\.")[1]) * 28;
            int day = Integer.parseInt(today.split("\\.")[2]);      
            
            todays = (year)
                        + (month)
                        + (day);            
            // String[] splitArray = today.split("\\."); //[yyyy], [mm], [dd]
            for(int i = 0 ; i < privacies.length ; i++){
                String[] arrPriv = privacies[i].split(" ");
                int pdays = 0;
                pdays = (Integer.parseInt(arrPriv[0].split("\\.")[0])-2000)*12*28 +
                    (Integer.parseInt(arrPriv[0].split("\\.")[1]))*28 +
                    (Integer.parseInt(arrPriv[0].split("\\.")[2]));
                
                // String t = arrPriv[1];
                int term = map.get(arrPriv[1]);

                if(todays - pdays > term * 28){
                    list.add(i + 1);                     
                } 
            }

            int[] answer = new int[list.size()];
            
            for(int i = 0 ; i < list.size() ; i++){
                answer[i] = list.get(i);
            }

            return answer;
    
        }
    }
    
}
