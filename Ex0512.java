import java.util.Scanner;

public class Ex0512 {
    
    public static void main(String[] args) {
        int x[] = {6,4,8,3,2,10,7};
        Scanner sc = new Scanner(System.in);
        selectionSort(x);
    }

    static void selectionSort(int a[]){
        for(int i = 0; i < a.length - 1; i++){
            int min = i;
            for(int j = i+1; j < a.length ; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            swap(a,i,min);
            for(int k = 0 ;k < a.length ; k++){
                System.out.print(a[k]);
            }
            System.out.println();
        }
    } 

    static void swap(int a[],int n,  int m){
        int temp = a[n];
        a[n] = a[m];
        a[m] = temp;
    }      
}
