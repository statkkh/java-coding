import java.util.Scanner;
import java.util.StringTokenizer;
public class Ex0507 {
    private static int n;
    private static int parent[];
    private static boolean visited[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        parent = new int[n];
        visited = new boolean[n];

        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);

        for(int i =0 ; i < n ; i++){
            parent[i] = Integer.parseInt(st.nextToken());

        }
        int removeIndex = sc.nextInt();
    }

    // 삭제 
    static void remove(int index){
        // 3:19:50
        visited[index] = true;
        for(int i = 0 ; i < n ; i++){
            if(parent[i] ==  index) remove(i);
        }
    }
    // 리프노드 개수
    //  
    static int leafCount( ){
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            if(visited[i]){
                continue;
            }
            if(isLeaf(i)) sum++;
        }
        return sum;
    }
    static boolean isLeaf(int index){
        visited[index] = true;
        boolean isLeaf = true;
        for(int i = 0 ; i < n ;i++){
            if(parent[i] == index){
                isLeaf = false;
                break;
            }
        }
        return isLeaf;
    }
}


