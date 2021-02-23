package case_study.model;

public class ServiceExtends {
    private String nameService;
    private int unit;
    private double price;

    public ServiceExtends() {
    }

    public ServiceExtends(String nameService, int unit, double price) {
        this.nameService = nameService;
        this.unit = unit;
        this.price = price;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
