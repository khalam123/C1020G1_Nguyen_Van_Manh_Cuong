package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
public class GiaoDich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "giao_dich_id")
    private Integer id;
    @Pattern(regexp = "^(MGD\\-+)[0-9]{4}", message = "Sai định dạng!! (MGD-xxxx)")
    private String maGiaoDich;

    private String ngayGiaoDich;
    private String loaiDV;
    @Min(value = 500, message = "Đơn giá phải lớn hơn 500.000 VNĐ")
    private Double donGia;
    @Min(value = 20,message = "Diện tích phải lớn hơn 20 m2")
    private Double dienTich;

    @ManyToOne
    @JoinColumn(name = "khach_hang_id",referencedColumnName = "khach_hang_id")
    @JsonManagedReference
    private KhachHang khachHang;

    public GiaoDich() {
    }

    public GiaoDich(Integer id, @Pattern(regexp = "^(MGD\\-+)[0-9]{4}", message = "Sai định dạng!! (MGD-xxxx)") String maGiaoDich, String ngayGiaoDich, String loaiDV, @Min(value = 500, message = "Đơn giá phải lớn hơn 500.000 VNĐ") Double donGia, @Min(value = 20, message = "Diện tích phải lớn hơn 20 m2") Double dienTich, KhachHang khachHang) {
        this.id = id;
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.loaiDV = loaiDV;
        this.donGia = donGia;
        this.dienTich = dienTich;
        this.khachHang = khachHang;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public String getLoaiDV() {
        return loaiDV;
    }

    public void setLoaiDV(String loaiDV) {
        this.loaiDV = loaiDV;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getDienTich() {
        return dienTich;
    }

    public void setDienTich(Double dienTich) {
        this.dienTich = dienTich;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
}
