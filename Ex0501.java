import java.util.TreeSet;

public class Ex0501 {
    
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(87);
        scores.add(78);
        scores.add(87);
        scores.add(87);
        scores.add(80);

        Integer score = null;
        score = scores.first();
        System.out.println("가장 낮은 점수 : " + score);
        
        
        score = scores.last();
        System.out.println("가장 높은 점수 : " + score);
        
        score = scores.lower(95);
        System.out.println("95점 아래 점수 : " + score);
        
        score = scores.higher(95);
        System.out.println("95점 위 점수 : " + score);

        score = scores.floor(94);
        System.out.println("94점 포함 바로 아래 점수 : " + score);
        
        score = scores.ceiling(94);
        System.out.println("94점이거나 바로 위 점수 : " + score);
        
    }
}
