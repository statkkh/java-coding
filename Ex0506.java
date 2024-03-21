import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex0506 {
    
    public static void main(String[] args) {
        
        int arr[] = {5, 7, 11, 15, 20, 28, 29, 31, 39, 58, 68, 70, 95};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int index = Arrays.binarySearch(arr, n);

        if(index < 0){
            System.out.println(String.format("존재하지 않는  %d 수 (%d)", n, index));
        }else{
            System.out.println(String.format("%d 수는 arr[%d]에 존재 ", n, index));
        }
        sc.close();
    }
}

// 가장 큰 수 찾기
class Solution{
    public int[] solution(int[] array){

        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i = 0 ; i < array.length ; i++){
            map.put(array[i], i);
        }

        Map.Entry<Integer, Integer> entry = null;
        
        entry = map.lastEntry();

        int[] answer = {entry.getKey(), entry.getValue()};
        return answer;
    }
}