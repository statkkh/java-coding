import java.util.Comparator;
import java.util.PriorityQueue;

public class ExPriorityQueue {
    
    public static void main(String[] args) {
        
        // 두번째 요소를 기준으로 오름차순 정렬
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1])); // 설명
    }
}
