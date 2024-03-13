import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex0602 {
    
    public static void main(String[] args) {
        int [] arr1 = {5,8,7,6,3,21,9};
        int [] arr2 = {12,8,14,6,2,21};


        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr1.length ; i++) {
            // list.add(arr1[i]);
            for(int j = 0 ; j < arr2.length ; j++) {
                if(arr1[i] == arr2[i]){
                    list.add(arr2[i]);
                }
            }
        }

        

        System.err.println(list.toString());

        // 합집합

        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < arr1.length ; i++) {
            set.add(arr1[i]);
        }

        for(int i = 0 ; i < arr2.length ; i++) {
            set.add(arr2[i]);
        }

        
        // 교집합 list - set
        Set<Integer> commonSet = new HashSet<>();

        for(int i = 0 ; i < arr1.length ; i++) {
            commonSet.add(arr1[i]);
        }

        for(int j = 0 ; j < arr2.length ;j++) {
            commonSet.add(arr2[j]);
        }
    
        // 차집합(arr1 - arr2)
        Set<Integer> minusSet = new HashSet<>();
        
    }
}
