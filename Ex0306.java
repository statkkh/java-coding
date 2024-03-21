public class Ex0306 {
    
    public static void main(String[] args) {
        
    }
        
    class Solution {
        public int solution(String[] spell, String[] dic) {
            // int answer = 0;
            // int cnt = 0;
            for(int i = 0 ; i < dic.length ; i++){
                boolean flag = true;
                
                for(int j=0; j < spell.length ; j++){
                    if(!dic[i].contains(spell[j])){
                        flag = false;
                        break;
                    }
                }
                
                if(flag){
                    return 1;
                }
            }
            return 2;
        }
    }    
}


