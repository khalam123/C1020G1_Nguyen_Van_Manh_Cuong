package case_study.model;

public class Villa extends Services {
    private String standardRoom;
    private String descriptionConvenient;
    private double areaPool;
    private int floor;

    public Villa() {
    }

    public Villa(String id,String nameService, double area, double costRent, int maxPeople, String typeRent, String standardRoom, String descriptionConvenient, double areaPool, int floor) {
        super(id,nameService, area, costRent, maxPeople, typeRent);
        this.standardRoom = standardRoom;
        this.descriptionConvenient = descriptionConvenient;
        this.areaPool = areaPool;
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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                ", standardRoom='" + standardRoom + '\'' +
                ", descriptionConvenient='" + descriptionConvenient + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(toString());
    }
}
