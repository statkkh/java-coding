import java.util.Map;
import java.util.TreeMap;

public class Ex0503 {
    
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(87, "심청이");
        scores.put(98, "김철수");
        scores.put(75, "기면지");
        scores.put(95, "아가사");
        scores.put(80, "오비이락");

        Map.Entry<Integer, String> entry = null;
        entry = scores.firstEntry();
        System.out.println("가장  낮은 점수 : " + entry.getKey());

        entry = scores.lastEntry();
        System.out.println("가장 높은 점수 : " + entry.getKey());
        
        entry = scores.lowerEntry(88);
        System.out.println("88  아래 점수 : " + entry.getKey());
        
        entry = scores.higherEntry(88);
        System.out.println("88  위  점수 : " + entry.getKey());

        entry = scores.floorEntry(88);
        System.out.println("88  혹은 바로 아래 점수 : " + entry.getKey());
        
        entry = scores.ceilingEntry(88);
        System.out.println("88  혹은 바로 위 점수 : " + entry.getKey());

        while(!scores.isEmpty()){
            entry = scores.pollLastEntry();
            System.out.println(entry.getKey() + " - " + entry.getValue() + "(남은 객체수 : " + scores.size() + ")");

        }

    }   
}
