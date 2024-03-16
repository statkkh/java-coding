import java.util.*;
public class Ex0605 {
    
    public static void main(String[] args) {
        
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        String append = "";
        String pattern = "^[a-zA-Z0-9-_.]";
        StringBuilder sb = new StringBuilder(); 

        answer = s.toLowerCase();
        // 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        answer = answer.replaceAll(pattern,".");
        // 마침표(.)가 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("..", ".").replaceAll("\\.$", ""); // 시작과 끝의 마침표 제거
            
        // 1
        if(answer.startsWith(".")){
            answer = answer.substring(1);
        }
        if(answer.endsWith(".")){
            answer = answer.substring(0 , answer.length() -1);
        }

        // 2 
        answer = answer.replaceAll("^[.]", "").replaceAll("[.]$", "");

        // 5 공백 일 때 a 로 채우기
        if(answer.equals("")) answer = "a";

        // 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        if(answer.length() > 15){
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        } 
        
        // 7 단계 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다   

        if(answer.length() <= 2){
            append = answer.substring(answer.length()-1, answer.length());
            while(answer.length() <= 2){
                answer += append;
            }
        }
        
        return answer;
    }

}