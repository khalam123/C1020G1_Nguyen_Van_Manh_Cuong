package bai2_loop_in_java.bai_tap;

import java.util.Scanner;

public class HienThiNSoNtoDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number list: ");
        int number = scanner.nextInt();
        System.out.printf("The first 30 primes is: ",number);
        int count = 1;
        for(int i=2; count<=number;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
        }
    }
    public static boolean isPrime(int num){
        if(num<2) return false;
        else{
            for (int i = 2; i <= Math.sqrt(num);i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
