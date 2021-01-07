package case_study.model;

public abstract class Services {
    private String nameService;
    private double area;
    private double costRent;
    private int maxPeople;
    private String typeRent;
    private String id;

    public Services() {
    }

    public Services(String id, String nameService, double area, double costRent, int maxPeople, String typeRent) {
        this.nameService = nameService;
        this.area = area;
        this.costRent = costRent;
        this.maxPeople = maxPeople;
        this.typeRent = typeRent;
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCostRent() {
        return costRent;
    }

    public void setCostRent(double costRent) {
        this.costRent = costRent;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", nameService='" + nameService + '\'' +
                ", area=" + area +
                ", costRent=" + costRent +
                ", maxPeople=" + maxPeople +
                ", typeRent='" + typeRent + '\'';
    }

    public abstract void showInfor();

}
