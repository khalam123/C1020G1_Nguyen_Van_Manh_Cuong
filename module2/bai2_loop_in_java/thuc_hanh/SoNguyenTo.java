package bai2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 2)
            System.out.println(number + " is not a prime");
        else {
            boolean check = true;
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number % i == 0) {
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.printf("%d is Prime",number);
            }else System.out.printf("%d is not Prime",number);
        }

    }
}
