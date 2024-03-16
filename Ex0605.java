import java.util.*;
public class Ex0605 {
    
    public static void main(String[] args) {
        
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        String temp = s;
        String pattern = "^[a-zA-Z0-9-_.]*$";
        StringBuilder sb = new StringBuilder(); 
        // 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        s = s.replaceAll("\\.{2,}",".");
        // 마침표(.)가 처음이나 끝에 위치한다면 제거
        s = s.replaceAll("^\\.", "").replaceAll("\\.$", ""); // 시작과 끝의 마침표 제거
            
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            //  모든 대문자를 대응되는 소문자로 치환            
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }
            // 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
            if(String.valueOf(ch).matches(pattern)){
                sb.append(ch);
            }
        
        }
        
        // 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        if(sb.length() > 15){
           sb.setLength(15);
            
            if (sb.charAt(sb.length() - 1) == '.') {
                sb.setLength(sb.length() - 1);
            }
        } 
        
        // 빈 문자열이라면, new_id에 "a"를 대입
        if(sb.length() == 0) sb.append("a");
        // 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다               
        while(sb.length() < 3 ){
            sb.append(sb.charAt(sb.length() -1));
        }
        
        return sb.toString();
    }

}