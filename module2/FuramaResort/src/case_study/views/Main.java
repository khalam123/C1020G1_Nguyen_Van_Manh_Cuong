package case_study.views;

import case_study.controllers.MainController;
import case_study.manager.CustomerManager;
import case_study.manager.ServiceManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        CustomerManager.initDataCustomer();
        ServiceManager.initData();
        MainController mainController = new MainController();
        mainController.displayMenu();
//        System.out.print("Enter your Dob: ");
//        String dob = "31/12/2000";
//        System.out.println(Regex.dobRegex(dob));
//        String dob1 = scanner.nextLine();

//        while (!Regex.dobRegex(dob1)){
//            System.out.println("Fail format Dob !! Try again follow format 'dd/mm/yyyy'");
//            System.out.print("Enter your dob: ");
//            dob1 = scanner.nextLine();
//        }
//        System.out.println(Regex.dobRegex(dob1));


    }
}
