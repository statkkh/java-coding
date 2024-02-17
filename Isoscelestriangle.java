public class Isoscelestriangle {
    
    public static void main(String[] args) {
        
        // 역 이등변삼각형
        for(int i = 5; i >= 1; i--){

            // for(int j = 5; i <= j ; j--){
            //     System.out.print(" ");
            // }
            for(int j = i ; j < 5 ; j++){
                System.out.print(" ");
            }

            for(int k = 1 ; k <= 2*i-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //  이등변삼각형
        for(int i = 1; i <= 5; i++){

            // for(int j = 5; i < j ; j--){
            //     System.out.print(" ");
            // }
            
            for(int j = 1; 5-i >= j ; j++){
                System.out.print(" ");
            }

            for(int k = 1 ; k <= 2*i-1 ; k++){
                System.out.print("*");
            }   
            System.out.println();
        }
    }
}
