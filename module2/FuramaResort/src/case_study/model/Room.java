package case_study.model;

public class Room extends Services {
    private String freeService;

    public Room() {
    }

    public Room(String id,String nameService, double area, double costRent, int maxPeople, String typeRent, String freeService) {
        super(id,nameService, area, costRent, maxPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room {"+ super.toString() +
                ", freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(toString());
    }
}
