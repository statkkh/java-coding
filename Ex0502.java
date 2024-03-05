import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex0502 {
    
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(98);
        scores.add(78);
        scores.add(71);
        scores.add(85);
        scores.add(80);
        
        NavigableSet<Integer> desc = scores.descendingSet();
        for(Integer score : desc){
            System.out.print(score + " ");
        }
        System.out.println();
        NavigableSet<Integer> asc = scores.descendingSet();
        for(Integer score : asc){
            System.out.print(score + " ");
        }
    }
}
