package case_study.model;

public class House extends Services {
    private String standardRoom;
    private String descriptionConvenient;
    private int floor;

    public House() {
    }

    public House(String id,String nameService, double area, double costRent, int maxPeople, String typeRent, String standardRoom, String descriptionConvenient, int floor) {
        super(id,nameService, area, costRent, maxPeople, typeRent);
        this.standardRoom = standardRoom;
        this.descriptionConvenient = descriptionConvenient;
        this.floor = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionConvenient() {
        return descriptionConvenient;
    }

    public void setDescriptionConvenient(String descriptionConvenient) {
        this.descriptionConvenient = descriptionConvenient;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House {" + super.toString() +
                ", standardRoom='" + standardRoom + '\'' +
                ", descriptionConvenient='" + descriptionConvenient + '\'' +
                ", Floor=" + floor +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(toString());
    }
}
