import java.util.LinkedList;
import java.util.Queue;

public class Ex1844 {
    
    public static void main(String[] args) {
        
    }

    // https://school.programmers.co.kr/learn/courses/30/lessons/1844
    class Solution {
        public int solution(int[][] maps) {
            int answer = -1;

            int []dx = {-1, 0, 1, 0};
            int []dy = { 0,-1, 0, 1};
            int height = maps.length;
            int width = maps[0].length;
            Queue<int []> queue = new LinkedList<>();
            queue.offer(new int[]{0, 0, 1});

            while(!queue.isEmpty()){
                int[]  currentPosition = queue.poll();
                int x = currentPosition[0];
                int y = currentPosition[1];
                int distance = currentPosition[2];

                if(x == height-1 && y == width-1){
                    answer = distance;
                }

                for(int i = 0 ; i< 4; i++){
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if(nx < 0 || nx >= width || ny < 0 || ny >= height || maps[nx][ny] == 0) continue;
                    //
                    queue.offer(new int[]{nx,ny, distance+1}); // queue에 두가지 이상의 값을 할당   
                    maps[nx][ny] =0;
                }
            }
            return answer;
        }

    }
}
