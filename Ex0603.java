class Solution {
    public int solution(String dartResult) {
        // int answer = 0;
        int[] scores = new int[3];
        int idx = 0;
        String strNum = "";
        int n = 0;
        for(int i = 0 ; i < dartResult.length() ; i++){
            char ch = dartResult.charAt(i);
            if(Character.isDigit(ch)){
                strNum += String.valueOf(ch);          
            }else if(ch == 'S' || ch == 'T' || ch == 'D'){
                n = Integer.parseInt(strNum);
                switch ((ch)) {
                    case 'S':
                        scores[idx++] = (int) Math.pow(n, 1);  
                        break;
                    case 'D':
                        scores[idx++] = (int) Math.pow(n, 2);                        
                        break;
                
                    default:
                        scores[idx++] = (int) Math.pow(n, 3);
                        break;
                }
                strNum = "";    
            }else{
                switch(ch){
                    case '*':
                        scores[idx-1] *= 2;
                        break;

                    default:
                        scores[idx-1] *= (-1);
                        break;
                }
            }
        }
        
        return scores[0] + scores[1] + scores[2];
    }
}

// * ->  *2
// # ->   마이너스
// 