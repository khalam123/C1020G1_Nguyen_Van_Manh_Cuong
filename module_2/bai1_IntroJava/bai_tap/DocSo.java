package bai1_IntroJava.bai_tap;

import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        int number,unit,tens, hundreds;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        number = scanner.nextInt();
        unit = 0;
        tens = 0;
        hundreds = 0;
        if(number == 0) {
            System.out.print("Zero");
        }else if(number>0 && number<=999){
            if(number<20){
                unit = number;
            }
            else if (number<100){
                tens = number / 10;
                unit = number % 10;
            }else{
                hundreds = number /100;
                tens = number % 100;
                if (tens >9 && tens<20){
                    unit = tens;
                }else {
                    tens = (number %100)/10;
                    unit = number % 10;
                }
            }
        }else System.out.println("Out of ability");
        if (hundreds>0){
            switch (hundreds){
                case 1:
                    System.out.print("One Hundred "); break;
                case 2:
                    System.out.print("Two Hundred "); break;
                case 3:
                    System.out.print("Three Hundred "); break;
                case 4:
                    System.out.print("Four Hundred "); break;
                case 5:
                    System.out.print("Five Hundred "); break;
                case 6:
                    System.out.print("Six Hundred "); break;
                case 7:
                    System.out.print("Seven Hundred "); break;
                case 8:
                    System.out.print("Eight Hundred "); break;
                case 9:
                    System.out.print("Nine Hundred "); break;
            }
        }
        if(tens>0){
            switch (tens){
                case 2:
                    System.out.print("Twenty "); break;
                case 3:
                    System.out.print("Thirty "); break;
                case 4:
                    System.out.print("Forty "); break;
                case 5:
                    System.out.print("Fifty "); break;
                case 6:
                    System.out.print("Sixty "); break;
                case 7:
                    System.out.print("Seventy "); break;
                case 8:
                    System.out.print("Eighty "); break;
                case 9:
                    System.out.print("Ninety "); break;
            }
        }
        if(unit>0){
            switch (unit){
                case 1:
                    System.out.print("one"); break;
                case 2:
                    System.out.print("Two"); break;
                case 3:
                    System.out.print("Three"); break;
                case 4:
                    System.out.print("Four"); break;
                case 5:
                    System.out.print("Five"); break;
                case 6:
                    System.out.print("Six"); break;
                case 7:
                    System.out.print("Seven"); break;
                case 8:
                    System.out.print("Eight"); break;
                case 9:
                    System.out.print("Nine"); break;
                case 10:
                    System.out.print("Ten");break;
                case 11:
                    System.out.print("Elevent");break;
                case 12:
                    System.out.print("Twelve");break;
                case 13:
                    System.out.print("Thirteen");break;
                case 14:
                    System.out.print("Fourteen");break;
                case 15:
                    System.out.print("Fifteen");break;
                case 16:
                    System.out.print("Sixteen");break;
                case 17:
                    System.out.print("Seventeen");break;
                case 18:
                    System.out.print("Eighteen");break;
                case 19:
                    System.out.print("Nineteen");break;
            }
        }
    }
}
