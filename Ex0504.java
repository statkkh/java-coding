import java.util.Scanner;

public class Ex0504 {
    //description :  선형 검색
    //description :  요소가 작은 모양으로 늘어선 배열에 원하는 키값을 갖는 요소를 만날떄 까지 
    //description :  맨 앞 부터 순서대로 요소를 검색하는 검색하는 알고리즘

    // description : 이진 검색
    // description : 요소가 오름차순 또는 내림차순 으로 정렬된 배열에서 검색하는 알고리즘

    public static void main(String[] args) {
        int arr[] = {6,4,8,3,2,1};//선형 검색
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 수 : ");
        int n = sc.nextInt();

        int index = SequenceSearch.sequenceSearch(arr, n);

        if(index == -1){
            System.out.println(String.format("존재하지 않는 %d 수", n));
            sc.close();
            return;
        }
        System.out.println(String.format("%d 수는 arr[%d]에 존재", n,index));
        sc.close();
    }
}

class SequenceSearch{
    static int sequenceSearch(int[] a, int key){
        for(int i = 0; i < a.length ; i++){
            if(a[i] == key) return i;
        }
        return -1;
    }
}
