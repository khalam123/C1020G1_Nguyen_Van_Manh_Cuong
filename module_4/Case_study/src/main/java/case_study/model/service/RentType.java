package case_study.model.service;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.List;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Min( value = 1, message = "Cost must be >0")
    private Double cost;

    @OneToMany(mappedBy = "rentType",cascade = CascadeType.ALL)
    @JsonBackReference
    List<ServiceResort> serviceResorts;


    public RentType() {
    }

    public RentType(Integer id, String name, @Min(value = 1, message = "Cost must be >0") Double cost, List<ServiceResort> serviceResorts) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.serviceResorts = serviceResorts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public List<ServiceResort> getServiceResorts() {
        return serviceResorts;
    }

    public void setServiceResorts(List<ServiceResort> serviceResorts) {
        this.serviceResorts = serviceResorts;
    }
}
