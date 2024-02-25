
public class Ex1104 {
    public static void main(String[] args) {
        String str = "Good Morning";
        // static 클래스 생성 없이 접근 가능//        
        // 대소문자 구분 //
        System.out.println("charAt" +str.charAt(7));
        System.out.println(str.startsWith("good"));
        System.out.println(str.endsWith("ng"));
        System.out.println(str.equals("good morning"));
        System.out.println(str.indexOf("Mor"));
        System.out.println(str.lastIndexOf("Mor"));
        System.out.println(str.length());

        System.out.println("replace :" + str.replace("Good", "a"));
        System.out.println("replace :" + str.replace("o", "a"));
        // 문자열 //
        System.out.println("replaceAll: " + str.replaceAll("Good", "a"));
        System.out.println(str.replaceAll("[Good]", "a")); // 안에 있는 문자가 하나라도 포함되면 변경
        
    }
    
}
