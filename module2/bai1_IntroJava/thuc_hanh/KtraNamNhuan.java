package bai1_IntroJava.thuc_hanh;

import java.util.Scanner;

public class KtraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            }else isLeapYear = false;
        }
        if(isLeapYear){
            System.out.printf("Year %d is a Leap Year", year);
        }else{
            System.out.printf("Year %d is a not Leap Year", year);
        }
    }
}
