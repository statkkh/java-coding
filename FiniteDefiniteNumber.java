import java.util.Scanner;

public class FiniteDefiniteNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

    }
}

class  Solution {
    public  int solution(int a, int b) {
        int answer = b / gcd(a,b);
            
        while(answer != 1){
            if(answer % 2 == 0) answer/=2;
            else if(answer % 5 == 0) answer/=5;
            else return 2;
        }
        
        return 1;
    }
    
    public  int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
