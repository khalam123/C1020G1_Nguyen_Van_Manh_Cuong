package case_study.model.service;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;


@Entity
public class ServiceResort {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer service_id;
    private String service_name;
    private int service_area;
    private double service_cost;
    private int service_max_people;
    private String standard_room;
    private String description;
    private double pool_area;
    private int floor;

    @ManyToOne
    @JoinColumn(name = "rent_type_id", referencedColumnName = "id")
    @JsonManagedReference
    private RentType rentType;

    public ServiceResort() {
    }

    public ServiceResort(Integer service_id, String service_name, int service_area, double service_cost, int service_max_people, String standard_room, String description, double pool_area, int floor, RentType rentType) {
        this.service_id = service_id;
        this.service_name = service_name;
        this.service_area = service_area;
        this.service_cost = service_cost;
        this.service_max_people = service_max_people;
        this.standard_room = standard_room;
        this.description = description;
        this.pool_area = pool_area;
        this.floor = floor;
        this.rentType = rentType;
    }

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public int getService_area() {
        return service_area;
    }

    public void setService_area(int service_area) {
        this.service_area = service_area;
    }

    public double getService_cost() {
        return service_cost;
    }

    public void setService_cost(double service_cost) {
        this.service_cost = service_cost;
    }

    public int getService_max_people() {
        return service_max_people;
    }

    public void setService_max_people(int service_max_people) {
        this.service_max_people = service_max_people;
    }

    public String getStandard_room() {
        return standard_room;
    }

    public void setStandard_room(String standard_room) {
        this.standard_room = standard_room;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPool_area() {
        return pool_area;
    }

    public void setPool_area(double pool_area) {
        this.pool_area = pool_area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }
}
