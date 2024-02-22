// https://www.acmicpc.net/problem/1966

import java.util.*;

import java.util.LinkedList;


public class PrinterQueue {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < test ; i++){

            int doc = sc.nextInt();

            int index = sc.nextInt();

            LinkedList<int []> queue = new LinkedList<>();
            
            for(int j = 0; j < doc; j++){
                queue.offer(new int[] {j , sc.nextInt()});
            }

            int printCount = 0;
            while(!queue.isEmpty()){
                // 맨앞 큐 가져오기
                int[] front = queue.poll();
                // 가져온 큐는 무조건 최대값

                boolean isMax = true;
                // 가져온 큐보다 큰 값이 있는지 확인(있으면 뒤로 보내기)
                for(int k = 0 ; k < queue.size() ; k++){
                    if(front[1] < queue.get(k)[1]){
                        queue.offer(front);
                        isMax = false;
                        break;
                    }
                }
                
                if(!isMax) continue;

                // 출력수 하나씩 더하기
                printCount++;
                // queue의 배열번호의 인덱스 번호 같으면 break
                if (index == front[0]) break;

            }
            //  테스트 케이스 출력수 얻기
            sb.append(printCount).append("\n");
        }
        sc.close();
        System.out.println(sb.toString());
    }

}
