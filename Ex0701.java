public class Ex0701 {
    

    // [PCCE 기출문제] 9번 / 이웃한 칸
    public static void main(String[] args) {
        
    }

    class Solution {
        public int solution(String[][] board, int h, int w) {
            int answer = 0;
            String compare = board[h][w];
            //     left up right down
            int[] dx = {-1,0,1,0};
            int[] dy = {0,-1,0,1};

            for(int i = 0 ; i< 4 ;i++){
                int nx = dx[i] + h;
                int ny = dy[i] + w;

                if(nx < 0 || nx >= board.length) continue;
                if(ny < 0 || ny >= board.length) continue;

                if(board[nx][ny].equals(compare)) answer++;
            }

            // int mx = board.length;
            // int mn = -1;
            // int hmn = (h == answer) ? answer : h-1;
            // int hmx = (h == board.length-1) ? board.length-1 : h+1;
            // int wmn = (w == answer) ? answer : w-1;
            // int wmx = (w == board.length-1) ? board.length-1 : w+1;
            // for(int i = hmn ; i <= hmx ; i++){
            //     for(int j = wmn; j <= wmx ; j++){
            //         if(h == i && w == j) continue;
            //         if(board[i][j].equals(compare)){
            //             answer++;
            //         }
            //     }
            // }
            return answer;
        }
    }    
}


