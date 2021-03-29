package bai2_loop_in_java.bai_tap;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Number is Prime < 100: ");
        for (int i =2;i < 100;i++){
            if (isPrime(i))
                System.out.print(i+" ");
        }

    }
    public static boolean isPrime(int num){
        if(num <2) return false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
