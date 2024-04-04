import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue {

    // decription : int 배열의 두 번째 요소를 기준으로 정렬 기준을 설정
    PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
}
