package case_study.manager;

import case_study.commons.FileCSV;

import java.util.List;
import java.util.Scanner;

public class Booking {
    public static void addNewBooking(){
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = FileCSV.fileReader("src/case_study/data/Customer.csv");

        for (int i = 0; i < stringList.size() ; i++) {
            System.out.println(i+". "+stringList.get(i));
        }
        System.out.print("Enter your choice: ");
        int choose = scanner.nextInt();

        String line = stringList.get(choose) ;
        int choice;
        do{
            System.out.print("\t==========Booking==========\n" +
                    "1. Booking Villa\n" +
                    "2. Booking House\n" +
                    "3. Booking Room\n" +
                    "4. Back to menu\n" +
//                    "5. Exit\n" +
                    "=============================================\n" +
                    "Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
//                    ServiceManager.showVilla();
                    List<String> listVilla = FileCSV.fileReader("src/case_study/data/Villa.csv");
                    for (int i = 0; i < listVilla.size() ; i++) {
                        System.out.println(i+". "+listVilla.get(i));
                    }
                    System.out.print("Enter your choice: ");
                    int choiceVL = scanner.nextInt();
                    line += ","+listVilla.get(choiceVL)+"\n";
                    FileCSV.fileWriter("src/case_study/data/Booking.csv",line);
                    System.out.println("~Booking success!!~");
                    break;
                case 2:
//                    ServiceManager.showHouse();
                    List<String> listHouse = FileCSV.fileReader("src/case_study/data/House.csv");
                    for (int i = 0; i < listHouse.size() ; i++) {
                        System.out.println(i+". "+listHouse.get(i));
                    }
                    System.out.print("Enter your choice: ");
                    int choiceHO = scanner.nextInt();
                    line += ","+listHouse.get(choiceHO)+"\n";
                    FileCSV.fileWriter("src/case_study/data/Booking.csv",line);
                    System.out.println("~Booking success!!~");
                    break;
                case 3:
//                    ServiceManager.showRoom();
                    List<String> listRoom = FileCSV.fileReader("src/case_study/data/Room.csv");
                    for (int i = 0; i < listRoom.size() ; i++) {
                        System.out.println(i+". "+listRoom.get(i));
                    }
                    System.out.print("Enter your choice: ");
                    int choiceRO = scanner.nextInt();
                    line += ","+listRoom.get(choiceRO);
                    FileCSV.fileWriter("src/case_study/data/Booking.csv",line);
                    System.out.println("~Booking success!!~");
                    break;
                case 4:break;
//                case 5:
//                    System.out.println("-- Thank you and See you later!! --");
//                    System.exit(0);
            }
        }while(choice != 4 );
    }

}
