package case_study.controllers;

import case_study.commons.FileCSV;
import case_study.manager.*;
import case_study.model.Employee;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MainController {
    static Scanner scanner = new Scanner(System.in);
    public void displayMenu(){
        int choice;
        do {
            System.out.print("\t------------MENU------------\n" +
                    "1. Add New Services\n" +
                    "2. Show Services\n" +
                    "3. Add New Customer\n" +
                    "4. Show Information of Customer\n" +
                    "5. Addc New Booking\n" +
                    "6. Show Information of Employee\n" +
                    "7. Cinema 4D\n"+
                    "8. Find Information Employee\n" +
                    "9. Exit\n" +
                    "------------------------------------------\n" +
                    "Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showService();
                    break;
                case 3:
                    CustomerManager.addNewCustomer();
                    break;
                case 4:
                    CustomerManager.showInforCustomer();
                    break;
                case 5:
                    Booking.addNewBooking();
                    break;
                case 6:
                    EmployeeManager.showEmployee();
                    break;
                case 7:
                    Cinema4D.displayCinema();
                    break;
                case 8:
                    findInformationEmployee();
                    break;
                case 9:
                    System.out.println("-- Thank you and See you later!! --");
                    break;
            }
        }while(choice != 9);

    }
    public void addNewServices(){
        int choice;
        do{
            System.out.print("\t==========Service==========\n" +
                    "1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n" +
                    "5. Exit\n" +
                    "=============================================\n" +
                    "Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    ServiceManager.addNewVilla();
                    break;
                case 2:
                    ServiceManager.addNewHouse();
                    break;
                case 3:
                    ServiceManager.addNewRoom();
                    break;
                case 4:break;
                case 5:
                    System.out.println("-- Thank you and See you later!! --");
                    System.exit(0);
            }
        }while (choice != 4);
    }
    public void showService(){
        int choice;
        do{
            System.out.print("\t==========Service==========\n" +
                    "1. Show list Villa\n" +
                    "2. Show list House\n" +
                    "3. Show list Room\n" +
                    "4. Show All Name Villa Not Duplicate\n" +
                    "5. Show All Name House Not Duplicate\n" +
                    "6. Show All Name Name Not Duplicate\n"+
                    "7. Back to menu\n" +
                    "8. Exit\n" +
                    "=============================================\n" +
                    "Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    ServiceManager.showVilla();
                    break;
                case 2:
                    ServiceManager.showHouse();
                    break;
                case 3:
                    ServiceManager.showRoom();
                    break;
                case 4:
                case 5:
                case 6:
                case 7:break;
                case 8:
                    System.out.println("-- Thank you and See you later!! --");
                    System.exit(0);
            }
        }while (choice != 7);
    }
    public static void findInformationEmployee(){
//        StackProfile stackProfile = new StackProfile();
//        if (!StackProfile.employeeStack.empty()){
//            Scanner scanner = new Scanner(System.in);
//            boolean flag = true;
//            System.out.print("Enter id Employee wanna search: ");
//            String id = scanner.nextLine();
//            while (!StackProfile.employeeStack.empty()) {
//                String employee = StackProfile.employeeStack.pop();
////                Employee employee1 = new Employee();
//                if (id.equals(employee)) {
//                    flag = false;
//                    System.out.println("Profile employee :" + employee);
//                    break;
//                }
//            }
//            if (flag) System.out.println("Employee, who you need dont have in System !");
//        } else System.out.println("Stack Profile is empty !");
////        System.out.println("Các Employee hiện tại có trong hệ thống là :");
////        int countEmployee = 1;
////        while (!stackProfile.employeeStack.empty()) {
////            System.out.println("Employee " + countEmployee  + stackProfile.employeeStack.pop());
////            countEmployee++;
////        }
        List<Employee> employeeStack = new Stack<>();
        List<String> employeeList = FileCSV.fileReader("src/case_study/data/Employee.csv");
        for (String str : employeeList) {
            String[] arr = str.split(",");
            String id = arr[0];
            String name = arr[1];
            int age = Integer.parseInt(arr[2]);
            String address = arr[3];
            employeeStack.add(new Employee(Integer.parseInt(id), name, age, address));
        }
        for(int i =0; i<employeeStack.size();i++){
            System.out.println((i+1)+"."+employeeStack.get(i).getNameEmployee());
        }
        System.out.print("Enter id of Employee:");
        scanner.nextLine();
        int index = Integer.parseInt(scanner.nextLine());
        for (Employee employee : employeeStack) {
            if (index == employee.getIdEmployee()) {
                System.out.println(employee.toString());
            }
        }
    }

}

