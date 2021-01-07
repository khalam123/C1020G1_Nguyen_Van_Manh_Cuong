package case_study.manager;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Cinema4D {
    static Queue<String> customers = new ArrayDeque<>();
    static Scanner scanner = new Scanner(System.in);
    public static void sellTicket(){
        if (customers.size()>=2){
            System.out.println("Sold out ticket! So Sorry :) ");
            return;
        }
        System.out.print("Enter name Customer: ");
        scanner.nextLine();
        String customer = scanner.nextLine();
        customers.add(customer);
        System.out.println("Booking success!!~");

    }
    public static void displayTicket(){
        int size = customers.size();
        while (true){
            String customer;
            if (size == customers.size() && customers.size() > 0)
                System.out.println("List customer buy ticket:");
            else if (size == 0)
                System.out.println("No one buy ticket!!~");
            if (customers.size() == 0){
                break;
            } else {
                customer = customers.poll();
                System.out.println(customer);
            }
        }
    }
    public static void displayCinema(){
        int choice;
        do{
            System.out.print("\t========== Cinema 4D ==========\n" +
                    "1. Buy ticket\n" +
                    "2. Print ticket\n" +
                    "3. Back to menu\n"+
                    "=============================================\n" +
                    "Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    sellTicket();
                    break;
                case 2:
                    displayTicket();
                    break;
                case 3:
                    break;
            }
        }while (choice != 3);
    }

}
