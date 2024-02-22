public class HiddenAddNumber {
    
    
}

class Solution{

    public int solution(String str){
        int result = 0;

        String arr[] = str.replaceAll("[a-zA-Z]", " ").split("");

        for(String  s : arr){
            if(!"".equals(s)){
                result += Integer.parseInt(s);
            }
        }
        return result;
    }
}