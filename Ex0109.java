public class Ex0109 {
    public static void main(String[] args) {
        ep:
        while(true){
            for(int i = 0 ; i < 50 ; i++){
                if(i == 25){
                    break ep;
                }
                System.out.println(i);
            }
        }
    }
}
