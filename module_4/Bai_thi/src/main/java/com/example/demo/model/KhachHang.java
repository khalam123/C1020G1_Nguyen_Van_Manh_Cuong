package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity

public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "khach_hang_id")
    private Integer id;

    private String makH;
    private String tenKH;
    private String sdt;
    private String email;

    @OneToMany(mappedBy = "khachHang", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<GiaoDich> GiaoDich;

    public KhachHang() {
    }

    public KhachHang(Integer id, String makH, String tenKH, String sdt, String email, List<GiaoDich> dsGiaoDich) {
        this.id = id;
        this.makH = makH;
        this.tenKH = tenKH;
        this.sdt = sdt;
        this.email = email;
        this.GiaoDich = dsGiaoDich;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMakH() {
        return makH;
    }

    public void setMakH(String makH) {
        this.makH = makH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<GiaoDich> getGiaoDich() {
        return GiaoDich;
    }

    public void setGiaoDich(List<GiaoDich> dsGiaoDich) {
        this.GiaoDich = dsGiaoDich;
    }
}
