import java.util.*;
public class Ex0608 {
    
    public static void main(String[] args) {
        
    }

    class Solution {
        public int[] solution(int[] numbers) {
            Set<Integer> set = new Set<>();
            for(int i = 0 ; i < numbers.length-1 ; i++){
                for(int j = i + 1; j < numbers.length; j++){
                    set.add(numbers[i] + numbers[j]);
                }
            }

            // List<Integer> list = new ArrayList<>(set);
            Interator<Integer> list = set.iterator();        
            
            // Collections.sort(list);
            
            int[] result = new int[set.size()];

            // for (int i = 0; i < list.size(); i++) {
            //     result[i] = list.get(i);
            // } 
            
            while(list.hasNext()){
                
            }
            
            return result;
        }
    }  
}
     