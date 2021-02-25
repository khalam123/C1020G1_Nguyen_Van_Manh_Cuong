package product_manager.model;

public class Product {
    private int id;
    private String name;
    private String company;
    private String country;

    public Product() {
    }

    public Product(int id, String name, String company, String country) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
