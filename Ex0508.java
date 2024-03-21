import java.util.Scanner;

public class Ex0508 {
    // 중복X
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("버블정렬할 점");
        System.out.print("개수: ");

        int n = sc.nextInt();
        int x[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println(String.format("x[%d]", i));
            x[i] = sc.nextInt();

        }

        bubbleSort(x, n);

        System.out.println("버블 정렬 후");
        for(int i = 0 ; i < n ; i++){
            System.out.println(String.format("x[%d] = %d", i, x[i]));
        }
    }

    static void bubbleSort(int a[], int n){
        for(int i=0; i < a.length - 1; i++){
            for(int j = i + 1 ; j < a.length ; j++){
                if(a[i] > a[j]){
                    swap(a, n, j);
                }
            }
        }
    }

    static void swap(int a[], int n, int m){
        int temp = a[n];
        a[n] = a[m];
        a[m] = temp;
    }
}
