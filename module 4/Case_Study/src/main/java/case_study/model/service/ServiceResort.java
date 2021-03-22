package case_study.model.service;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;


@Entity
public class ServiceResort {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer service_id;

    @Pattern(regexp = "(DV\\-+)[0-9]{4}", message = "Service code follow format DV-xxxx")
    private String service_code;

    private String service_name;
    @Min(value = 1, message = "Area must be > 0")
    private Integer service_area;
    @Min(value = 1, message = "Cost must be > 0")
    private Double service_cost;
    @Min(value = 0, message = "People must be >= 0")
    private Integer service_max_people;

    private String standard_room;
    private String description;
    @Min(value = 1, message = "Pool area must be > 0")
    private Double pool_area;
    @Min(value = 1, message = "Floor must be > 0")
    private Integer floor;

    @ManyToOne
    @JoinColumn(name = "rent_type_id", referencedColumnName = "id")
    @JsonManagedReference
    private RentType rentType;

    public ServiceResort() {
    }

    public ServiceResort(Integer service_id, @Pattern(regexp = "(DV\\-+)[0-9]{4}", message = "Service code follow format DV-xxxx") String service_code, String service_name, @Min(value = 1, message = "Area must be > 0") Integer service_area, @Min(value = 1, message = "Cost must be > 0") Double service_cost, @Min(value = 0, message = "People must be >= 0") Integer service_max_people, String standard_room, String description, @Min(value = 1, message = "Pool area must be > 0") Double pool_area, @Min(value = 1, message = "Floor must be > 0") Integer floor, RentType rentType) {
        this.service_id = service_id;
        this.service_code = service_code;
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

    public Integer getService_area() {
        return service_area;
    }

    public void setService_area(Integer service_area) {
        this.service_area = service_area;
    }

    public Double getService_cost() {
        return service_cost;
    }

    public void setService_cost(Double service_cost) {
        this.service_cost = service_cost;
    }

    public Integer getService_max_people() {
        return service_max_people;
    }

    public void setService_max_people(Integer service_max_people) {
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

    public Double getPool_area() {
        return pool_area;
    }

    public void setPool_area(Double pool_area) {
        this.pool_area = pool_area;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public RentType getRentType() {
        return rentType;
    }


    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public String getService_code() {
        return service_code;
    }

    public void setService_code(String service_code) {
        this.service_code = service_code;
    }
}
