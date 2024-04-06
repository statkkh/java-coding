public class Ex12952 {
    
    public static void main(String[] args) {
        
    }
}

class Solution {
    int answer = 0;
    
    public int solution(int n) {
        
        // 직선
        boolean[] vis1 = new boolean[n+1];
        // 왼쪽 위 ~ 아래쪽 아래
        boolean[] vis2 = new boolean[2*n];
        // 왼쪽 아래부터 오른쪽 위
        boolean[] vis3 = new boolean[2*n];

        dfs(n, 0,vis1, vis2, vis3);
        return answer;
    }

    void dfs(int target, int deep, boolean vis1[], boolean vis2[], boolean vis3[]){
        if(deep == target){
            answer++;
            return;
        }

        for(int col = 0 ; col < target ;col++){
            if(!vis1[col] && !vis2[target+deep-col] && !vis3[deep+col]){
                vis1[col] = true;
                vis2[target+deep-col] = true;
                vis3[deep+col] = true;
                dfs(target , deep+1, vis1, vis2, vis3);
                vis1[col] = false;
                vis2[target+deep-col] = false;
                vis3[deep+col] = false;
            }
        }
    }
}