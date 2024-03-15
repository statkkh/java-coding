public class Ex0510 {
    
    public static void main(String[] args) {
        int n = 7;
        int x[] = {1,3,9,4,8,6,15};
        bubbleSort(x);        
    }

    static void bubbleSort(int a[]){
        int count = 0;
        int exchange = 0;
        for(int i=0; i < a.length - 1  ; i++){
            int cnt = 0;
            System.out.println("패스 : " + (i + 1));
            for(int j = a.length - 1 ; j > 1 ; j--){ // 비교
                if(a[j-1] > a[j]){
                    swap(a,  j-1, j);
                    cnt++;
                    exchange++;
                }

                for(int k = 0 ; k < a.length ; k++){
                    System.out.print(a[k] + " ");
                }
                System.out.println();
                count++;
            }
            if(cnt == 0) break;
        }
        System.out.println("비교횟수 : " + count);
        System.out.println("교환횟수 : " + exchange);
    }

    static void swap(int a[],int n,  int m){
        int temp = a[n];
        a[n] = a[m];
        a[m] = temp;
    }       
}
