
package programmers;

import java.util.ArrayList;

public class Ex86971 {

    public static void main(String[] args) {

    }
}

class Solution {

    static ArrayList<Integer>[] graph;
    static  int min;
    public int solution(int n, int[][] wires) {
        graph = new ArrayList[n + 1];
        min = Integer.MAX_VALUE;

        for(int i = 1 ; i <= n ; i++){
            graph[i] = new ArrayList<>();
        }

        // 간선 연결
        for(int i = 1 ; i < wires.length ; i++){
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        ///////////////////////////////////////////////////
        for(int i = 0 ; i < wires.length ; i++){
            // 단절한 구간
            int v1 = wires[i][0];
            int v2 = wires[i][1];

            // 방문 체크 배열 초기화
            boolean[] visited = new boolean[n+1];

            // 간선 제거
            graph[v1].remove(Integer.valueOf(v2));
            graph[v2].remove(Integer.valueOf(v1));

            // 방문한 횟수 구하기
            int cnt = dfs(1, visited); // 임의의 시작점에서 dfs 탐색

            // 방문한 횟수 - 미 방문한 횟수
            int diff = Math.abs(cnt - ( n - cnt));
            min = Math.min(min, diff);

            // 그래프에 다시 간선 추가
            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        int answer = -1;
        return min;
    }

    static int dfs(int v, boolean[] visited){
        visited[v] = true;
        int cnt = 1;

        for(int next : graph[v]){
            if(!visited[next]){
                cnt += dfs(next, visited);
            }
        }
        return  cnt;
    }
}
