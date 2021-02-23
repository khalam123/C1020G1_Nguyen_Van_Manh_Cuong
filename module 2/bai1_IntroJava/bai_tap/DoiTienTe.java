package bai1_IntroJava.bai_tap;

import java.util.Scanner;

public class DoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your USD ($): ");
        int USD = scanner.nextInt();
        System.out.println("Convert USD to VND: "+ USD*23000+ " VND" );
    }
}
