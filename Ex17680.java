import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Ex17680 {
    
    // https://school.programmers.co.kr/learn/courses/30/lessons/17680
    public static void main(String[] args) {
        
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        
        Solution sol = new Solution();
        int result = sol.solution(3, cities);
        
        System.out.println(result);
    }


}
class Solution {
    int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        List<String> list = new ArrayList<>();
        
        if(cacheSize == 0) return cities.length*5;
        for(int i = 0 ; i < cities.length ; i++){
            String city = cities[i].toLowerCase();
            if(!list.contains(cities[i])){
                // full
                if(list.size() == cacheSize){
                    list.remove(0);
                }
                list.add(city);
                answer+=5;
            }
            if(list.contains(city)){
                list.remove(city);
                list.add(city);
                answer+=1;
            }            
        }
        
        return answer;
    }
}