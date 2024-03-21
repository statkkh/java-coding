import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class Ex0207 {
    
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");

        
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(iterator.next());
        }
        
        set.add("A");
        for(String str : set){
            System.out.println(str);
        }
        System.out.println(set.size());
    }
}
