public class Ex0115 {
    
    public static void main(String[] args) {
        String str1 = "aaa";
        String str2 = "aaa";
        
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        
        String str3 = new String("aaa");
        String str4 = new String("aaa");
        
        // 객체는 Heap 메모리에 저장
        // equals 함수 -> 값자체를  비교
        System.out.println(str3 == str4);
        System.out.println(str1 == str4);
        System.out.println(str3 == str4);
        System.out.println(str1.equals(str3));

    }
}
