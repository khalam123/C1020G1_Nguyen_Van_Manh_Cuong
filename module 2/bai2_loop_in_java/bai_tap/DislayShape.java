package bai2_loop_in_java.bai_tap;

import java.util.Scanner;

public class DislayShape {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    for(int i=0;i<3;i++){
                        for(int j=0;j<8;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for(int i = 1;i <= 5;i++){
                        for(int j = 1;j <= i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for(int i = 1;i <= 5;i++){
                        for (int j = 5; j>=i; j--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for(int i=1;i<=5;i++){
                        for (int j = 5;j>=i;j--) {
                            System.out.print(" ");
                        }
                            for(int z=1;z<=i;z++){
                                System.out.print("*");
                            }
                        System.out.println();
                    }
                    System.out.println();
                    for(int i=1;i<=5;i++){
                        for (int j = 1;j<=i;j++) {
                            System.out.print(" ");
                        }
                        for(int z=5 ;z>=i;z--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 3:
                    for (int r = 1; r <= 5; r++) {
                        for (int sp = 5 - r ; sp >= 1; sp--) {
                            System.out.print(" ");
                        }
                        for (int c = 1; c <= r; c++) {
                            System.out.print("*");
                        }
                        for (int c = r - 1; c >= 1; c--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }while(choice!=0);
    }
}
