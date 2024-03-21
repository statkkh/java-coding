import java.util.Scanner;

public class Ex0505 {
    
    //description :  선형 검색
    //description :  요소가 작은 모양으로 늘어선 배열에 원하는 키값을 갖는 요소를 만날떄 까지 
    //description :  맨 앞 부터 순서대로 요소를 검색하는 검색하는 알고리즘
    //description :  사전 정렬 필수    
    public static void main(String[] args) {

        int arr[] = {5, 7, 11, 15, 20, 28, 29, 31, 39, 58, 68, 70, 95};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = BinSearch.binSearch(arr, n);
        if(index == -1){
            System.out.println(String.format("존재하지 않느 %d 수", n));
        }else{
            System.out.println(String.format("%d 수는 arr[%d]에 존재 ", n, index));
        }
        sc.close();
    }
}

class BinSearch{
    static int binSearch(int[] a, int key){
        int pl = 0;
        int pr = a.length - 1;

        do {
            int pc = (pl + pr) /2;
            if(a[pc] == key) return pc;
            if(a[pc] < key) pl = pc + 1;
            else pr = pc - 1;
        } while (pl <= pr);

        return -1;
    }
}
