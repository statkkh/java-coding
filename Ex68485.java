import java.util.Arrays;

public class Ex68485 {
    
    // https://school.programmers.co.kr/learn/courses/30/lessons/68645
    public static void main(String[] args) {

        int n = 5;
        int [][]array = new int[n][n];
        int nx = -1;
        int ny = 0;
        int number = 1;

        int[] num = new int[(n*(n+1))/2];

        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ;j++){

                if(i % 3 == 0){
                    nx++;
                }
                if(i % 3 == 1){
                    ny++;
                }
                if(i % 3 == 2){
                    nx--;
                    ny--;
                }
                array[nx][ny] = number++;
            }
        }

        int index = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++)
                num[index++] = array[i][j];
        }

        System.out.println(Arrays.toString(num));
    }    
}
