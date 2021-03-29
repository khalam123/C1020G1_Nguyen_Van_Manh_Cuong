package case_study.manager;

import case_study.commons.FileCSV;
import case_study.model.Customer;
import case_study.model.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> listCustomers = new ArrayList<>();
    public static void initDataCustomer() {
        List<String> list = FileCSV.fileReader("src/case_study/data/Customer.csv");
        boolean firstLine = false;
        for (String str : list) {
            if (!firstLine) {
                firstLine = true;
                continue;
            }

            String[] dataArr = str.split(",");

            String nameCustomer = dataArr[0];
            String dob = dataArr[1];
            String gender = dataArr[2];
            int idCard = Integer.parseInt(dataArr[3]);
            int phone = Integer.parseInt(dataArr[4]);
            String email = dataArr[5];
            String typeCustomer = dataArr[6];
            String address = dataArr[7];
            listCustomers.add(new Customer(nameCustomer,dob,gender,idCard,phone,email,typeCustomer,address));
        }
    }
    public static void addNewCustomer(){
        System.out.print("Enter your name: ");
        String nameCustomer = scanner.nextLine();
        while (!Regex.nameRegex(nameCustomer)){
            System.out.println("Fail format name!! Try again follow format 'Abc Abc'");
            System.out.print("Enter your name: ");
            nameCustomer = scanner.nextLine();
        }
        System.out.print("Enter your birthday: ");
        String dob = scanner.nextLine();
        while (!Regex.dobRegex(dob)){
            System.out.println("Fail format Dob !! Try again follow format 'dd/mm/yyyy' ");
            System.out.print("Enter your dob: ");
            dob = scanner.nextLine();
        }

        System.out.print("Female or Male or Unknown: ");
        String gender = scanner.nextLine();
        while (!Regex.genderRegex(gender)){
            System.out.println("Fail format gender !! Try again choice 1 of 3: Male,Female or Unknown");
            System.out.print("Enter your gender: ");
            gender = scanner.nextLine();
        }

        System.out.print("Enter your ID card: ");
        String idCard = scanner.nextLine();
        while (!Regex.idCardRegex(idCard)){
            System.out.println("Fail format ID Card !! Try again follow format 'XXXXXXXXX'");
            System.out.print("Enter your ID Card: ");
            idCard = scanner.nextLine();
        }
        System.out.print("Enter your phone number: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        while (!Regex.emailRegex(email)){
            System.out.println("Fail format name!! Try again follow format 'abc@abc.abc'");
            System.out.print("Enter your email: ");
            email = scanner.nextLine();
        }

        System.out.print("Enter type Customer: ");
        String typeCustomer = scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
//        System.out.print("Enter your Service: ");
//        String servicesID = scanner.nextLine();
        //while(true) {
          //  if (Regex.idVilla(servicesID) || Regex.idHouse(servicesID) || Regex.idRoom(servicesID)) {
          //      break;
          //  } else {
           //     System.out.println("Fail format ID Service!! Try again follow format 'SVXX-xxxx','XX(VL,HO,RO)','xxxx(0-9)'");
          //      System.out.print("Enter again: ");
          //      servicesID = scanner.nextLine();
          //  }
        //}
        Customer customer = new Customer(nameCustomer, dob, gender, Integer.parseInt(idCard), phone,
                email, typeCustomer, address);

        listCustomers.add(customer);
        String line = "";
        String pathFile = "src/case_study/data/Customer.csv";
        for (Customer value : listCustomers) {
            line = value.getNameCustomer() + "," + value.getDob() +
                    "," + value.getGender() + "," + value.getIdCard() + "," + value.getPhone()
                    + "," + value.getEmail() + "," +value.getTypeCustomer()+","+ value.getAddress();
            FileCSV.fileWriter(pathFile, line);
        }
    }
    public static void showInforCustomer(){
        listCustomers.sort(new Customer());
        for (Customer customer: listCustomers)
            customer.showInfor();
    }

}
