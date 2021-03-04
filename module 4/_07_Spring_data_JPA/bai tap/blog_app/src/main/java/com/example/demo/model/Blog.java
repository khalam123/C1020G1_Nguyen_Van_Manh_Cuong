package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String text;
    @Column(columnDefinition = "date",name = "date_create")
    private LocalDate dateCreate;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    @JsonManagedReference
    private Category category;

    public Blog() {
    }

    public Blog(int id, String text, LocalDate dateCreate, Category category) {
        this.id = id;
        this.text = text;
        this.dateCreate = dateCreate;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
