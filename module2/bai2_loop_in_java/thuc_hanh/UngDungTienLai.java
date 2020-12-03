package bai2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        double interset_rate = 1.0;
        int month =1;
        System.out.print("Enter your money: ");
        money = scanner.nextDouble();
        System.out.print("Enter number of month: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate = scanner.nextDouble();

        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset += money * (interset_rate/100)/12 * month;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}
