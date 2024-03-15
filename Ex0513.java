public class Ex0513 {
    
    public static void main(String[] args) {
        int x[] = {3,4,15,1,8,6,5};
        insertSort(x);

    }

    static void insertSort(int a[]){
        for(int i=1; i < a.length - 1  ; i++){
            int j;
            int temp = a[i];

            for( j=1; j > 0 && a[j-1] > temp; j--){
                a[j] = a[j - 1];
            }
            // a[j] = temp;
            temp = a[j];
            for(int k = 0 ; k < a.length ; k++){
                System.out.print(a[k] + " ");
            }            
            System.out.println();
        }
    }
}


// 크래인 인형 뽑기 게임