public class ChickenCoupon {
    
    public static void main(String[] args) {
        
    }
}

class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int count = 0;


        while(coupon >= 10){
            int leftcoupon = coupon % 10;
            count += coupon / 10;
            coupon = leftcoupon + coupon / 10;
        }

        return count;        
    }
}
