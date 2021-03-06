package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookLendNumber {
    @Id
    private Integer id;
    private Integer lendNumber;

    public BookLendNumber() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLendNumber() {
        return lendNumber;
    }

    public void setLendNumber(Integer lendNumber) {
        this.lendNumber = lendNumber;
    }
}