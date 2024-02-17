import java.util.Scanner;

public class SumOfConsecutiveNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = fibo(number+1);

        System.out.println(result);
    }

    static int fibo(int n){
        if(n==1) return 0;
        if(n==2) return 1;

        return fibo(n-1) + fibo(n-2);
    }
}

// class Solution {
//     public int[] solution(int num, int total) {
//         int[] answer = new int[num];
//         int start = (total/num) - ((num - 1)/2);
        
//         for(int i = 0; i < num; i++) {
//             answer[i] = start;
//             start++;
//         }
        
//         return answer;
//     }
// }