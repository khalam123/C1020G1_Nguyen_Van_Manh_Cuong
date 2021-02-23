package case_study.manager;

import case_study.commons.FileCSV;
import case_study.model.House;
import case_study.model.Regex;
import case_study.model.Room;
import case_study.model.Villa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static case_study.commons.FileCSV.fileReader;
import static case_study.manager.EmployeeManager.pathFile;

public class ServiceManager {
    static Scanner scanner = new Scanner(System.in);
    static List<Villa> listVilla = new ArrayList<>();
    static List<House> listHouse = new ArrayList<>();
    static List<Room> listRoom = new ArrayList<>();

    public static void initData(){
        List<String> list = FileCSV.fileReader("src/case_study/data/Villa.csv");
        boolean firstLine=false;
        for (String str:list) {
            if(!firstLine){firstLine=true;continue;}

            String[] dataArr = str.split(",");
            String id=dataArr[0];
            String nameService=dataArr[1];

            double area=Double.parseDouble( dataArr[2]);
            double costRent=Double.parseDouble(dataArr[3]);
            int maxPeople= Integer.parseInt(dataArr[4]);
            String typeRent=dataArr[5];
            String standardRoom=dataArr[6];
            String descriptionConvenient=dataArr[7];
            double areaPool= Double.parseDouble(dataArr[8]);
            int floor= Integer.parseInt(dataArr[9]);
            listVilla.add(new Villa(id,nameService, area, costRent, maxPeople, typeRent, standardRoom,
                    descriptionConvenient, areaPool, floor));
        }
        list = FileCSV.fileReader("src/case_study/data/House.csv");
        firstLine=false;
        for (String str:list) {
            if(!firstLine){firstLine=true;continue;}

            String[] dataArr = str.split(",");
            String id=dataArr[0];
            String nameService=dataArr[1];
            double area=Double.parseDouble(dataArr[2]);
            double costRent=Double.parseDouble(dataArr[3]);
            int maxPeople= Integer.parseInt(dataArr[4]);
            String typeRent=dataArr[5];
            String standardRoom=dataArr[6];
            String descriptionConvenient=dataArr[7];
//            double areaPool= Double.parseDouble(dataArr[8]);
            int floor= Integer.parseInt(dataArr[8]);
            listHouse.add(new House(id,nameService, area, costRent, maxPeople, typeRent, standardRoom,
                    descriptionConvenient, floor));
        }
        list = FileCSV.fileReader("src/case_study/data/Room.csv");
        firstLine=false;
        for (String str:list) {
            if(!firstLine){firstLine=true;continue;}

            String[] dataArr = str.split(",");
            String id=dataArr[0];
            String nameService=dataArr[1];
            double area=Double.parseDouble(dataArr[2]);
            double costRent=Double.parseDouble(dataArr[3]);
            int maxPeople= Integer.parseInt(dataArr[4]);
            String typeRent=dataArr[5];
            String freeService = dataArr[6];
//            double areaPool= Double.parseDouble(dataArr[8]);
//            int floor= Integer.parseInt(dataArr[8]);
            listRoom.add(new Room(id,nameService, area, costRent, maxPeople, typeRent, freeService));
        }

    }
    public static void addNewVilla() {
        System.out.println("Enter Id Villa: ");
        String id = scanner.nextLine();
        while (!Regex.idVilla(id)){
            System.out.println("Fail format id Villa!! Try again follow format 'SVVL-xxxx' 'xxxx: 0-9'");
            System.out.print("Enter again: ");
            id = scanner.nextLine();
        }
        System.out.print("Enter Name Villa: ");
        String nameService = scanner.nextLine();

        System.out.print("Enter area Villa: ");
        String area = scanner.nextLine();
        while (!Regex.areaRegex(area)){
            System.out.println("Fail format area Villa!! Try again follow format '>30m2'");
            System.out.print("Enter again: ");
            area = scanner.nextLine();
        }
        System.out.print("Enter Cost Rent: ");
        String costRent = scanner.nextLine();
        while (!Regex.costRent(costRent)){
            System.out.println("Fail format Cost rent!! Try again follow format '>0'");
            System.out.print("Enter again: ");
            costRent = scanner.nextLine();
        }
        System.out.print("Enter Max People: ");
        String maxPeople = scanner.nextLine();
        while (!Regex.peopleRegex(maxPeople)){
            System.out.println("Fail format people! Try again follow format '>0 & <20'");
            System.out.print("Enter again: ");
            maxPeople = scanner.nextLine();
        }

        System.out.print("Enter Type Rent: ");
        String typeRent = scanner.nextLine();
        System.out.print("Enter Standard Room:");
        String standardRoom = scanner.nextLine();
        System.out.print("Enter Description Convenient: ");
        String descriptionConvenient = scanner.nextLine();
        System.out.print("Enter Area Pool: ");
        String areaPool = scanner.nextLine();
        while (!Regex.areaPool(areaPool)){
            System.out.println("Fail format area Villa!! Try again follow format '>30m2'");
            System.out.print("Enter again: ");
            areaPool = scanner.nextLine();
        }
        System.out.print("Enter Floor of Villa: ");
        String floor = scanner.nextLine();
        while (!Regex.floorRegex(floor)){
            System.out.println("Fail format!! Try again follow format '>0'");
            System.out.print("Enter again: ");
            floor = scanner.nextLine();
        }
        Villa villa = new Villa(id, nameService,Double.parseDouble(area), Double.parseDouble(costRent), Integer.parseInt(maxPeople), typeRent, standardRoom,
                descriptionConvenient, Double.parseDouble(areaPool),Integer.parseInt(floor));
        listVilla.add(villa);
        String line = "";
        String pathFile = "src/case_study/data/Villa.csv";
        for (Villa value : listVilla) {
            line = value.getId() + "," + value.getNameService() +
                    "," + value.getArea() + "," + value.getCostRent() + "," + value.getMaxPeople()
                    + "," + value.getTypeRent() + "," +value.getStandardRoom()+","+ value.getDescriptionConvenient() + "," + value.getAreaPool()
                    + "," + value.getFloor();
            FileCSV.fileWriter(pathFile, line);
        }
    }
    public static void showVilla(){
//        String pathFile = "src/case_study/data/Villa.csv";
//        List<String> employeeMap = fileReader("src/case_study/data/Employee.csv");
        for (Villa villa : listVilla)
            villa.showInfor();
    }
    public static void addNewHouse(){
        System.out.print("Enter ID House: ");
        String id = scanner.nextLine();
        while (!Regex.idHouse(id)){
            System.out.println("Fail format id House!! Try again follow format 'SVHO-xxxx' 'xxxx: 0-9'");
            System.out.print("Enter again: ");
            id = scanner.nextLine();
        }
        System.out.print("Enter Name House: ");
        String nameService = scanner.nextLine();
        System.out.print("Enter area House: ");
        String area = scanner.nextLine();
        while (!Regex.areaRegex(area)){
            System.out.println("Fail format area House!! Try again follow format '>30m2'");
            System.out.print("Enter again: ");
            area = scanner.nextLine();
        }
        System.out.print("Enter Cost Rent: ");
        String costRent = scanner.nextLine();
        while (!Regex.costRent(costRent)){
            System.out.println("Fail format Cost rent!! Try again follow format '>0'");
            System.out.print("Enter again: ");
            costRent = scanner.nextLine();
        }
        System.out.print("Enter Max People: ");
        String maxPeople = scanner.nextLine();
        while (!Regex.peopleRegex(maxPeople)){
            System.out.println("Fail format !! Try again follow format '>0 & <20' ");
            System.out.print("Enter again: ");
            maxPeople = scanner.nextLine();
        }
        System.out.print("Enter Type Rent: ");
        String typeRent = scanner.nextLine();
        System.out.print("Enter Standard Room:");
        String standardRoom = scanner.nextLine();
        System.out.print("Enter Description Convenient: ");
        String descriptionConvenient = scanner.nextLine();
        System.out.print("Enter Floor of House: ");
        String floor = scanner.nextLine();
        while (!Regex.floorRegex(floor)){
            System.out.println("Fail format!! Try again follow format '>0'");
            System.out.print("Enter again: ");
            floor = scanner.nextLine();
        }
        House house = new House(id,nameService,Double.parseDouble(area), Double.parseDouble(costRent), Integer.parseInt(maxPeople)
                ,typeRent,standardRoom,descriptionConvenient, Integer.parseInt(floor));
        listHouse.add(house);
        String line = "";
        String pathFile = "src/case_study/data/House.csv";
        for (House value : listHouse) {
            line = value.getId() + "," + value.getNameService() +
                    "," + value.getArea() + "," + value.getCostRent() + "," + value.getMaxPeople()
                    + "," + value.getTypeRent() +","+value.getStandardRoom()+ "," + value.getDescriptionConvenient() + ","
                    + "," + value.getFloor();
            FileCSV.fileWriter(pathFile, line);
        }
    }
    public static void showHouse(){
        for (House house : listHouse)
            house.showInfor();
    }
    public static void addNewRoom(){
        System.out.print("Enter ID Room: ");
        String id = scanner.nextLine();
        while (!Regex.idRoom(id)){
            System.out.println("Fail format id Room!! Try again follow format 'SVRO-xxxx' 'xxxx: 0-9'");
            System.out.print("Enter again: ");
            id = scanner.nextLine();
        }
        System.out.print("Enter Name Room: ");
        String nameService = scanner.nextLine();
        System.out.print("Enter area Room: ");
        String area = scanner.nextLine();
        while (!Regex.areaRegex(area)){
            System.out.println("Fail format area Room!! Try again follow format '>30m2'");
            System.out.print("Enter again: ");
            area = scanner.nextLine();
        }
        System.out.print("Enter Cost Rent: ");
        String costRent = scanner.nextLine();
        while (!Regex.costRent(costRent)){
            System.out.println("Fail format!! Try again follow format '>0'");
            System.out.print("Enter again: ");
            costRent = scanner.nextLine();
        }
        System.out.print("Enter Max People: ");
        String maxPeople = scanner.nextLine();
        while (!Regex.peopleRegex(maxPeople)){
            System.out.println("Fail format !! Try again follow format '>0 & <20' ");
            System.out.print("Enter again: ");
            maxPeople = scanner.nextLine();
        }
        System.out.print("Enter Type Rent: ");
        String typeRent = scanner.nextLine();
        System.out.print("Enter Free Service: ");
        String freeService = scanner.nextLine();
        Room room = new Room(id, nameService, Double.parseDouble(area), Double.parseDouble(costRent), Integer.parseInt(maxPeople), typeRent, freeService);
        listRoom.add(room);
        String line = "";
        String pathFile = "src/case_study/data/Room.csv";
        for (Room value : listRoom) {
            line = value.getId() + "," + value.getNameService() +
                    "," + value.getArea() + "," + value.getCostRent() + "," + value.getMaxPeople()
                    + "," + value.getTypeRent() + "," + value.getFreeService();
            FileCSV.fileWriter(pathFile, line);
        }
    }
    public static void showRoom(){
        for (Room room: listRoom)
            room.showInfor();
    }

}
