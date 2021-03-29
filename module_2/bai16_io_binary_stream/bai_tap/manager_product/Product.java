package bai16_io_binary_stream.bai_tap.manager_product;

import java.io.Serializable;

public class Product implements Serializable {
    private  int id;
    private  String nameProduct;
    private  String company;
    private  int price;
    private  String detailOther;

    public Product() {
    }

    public Product(int id, String nameProduct, String company, int price, String detailOther) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.company = company;
        this.price = price;
        this.detailOther = detailOther;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDetailOther() {
        return detailOther;
    }

    public void setDetailOther(String detailOther) {
        this.detailOther = detailOther;
    }

    @Override
    public String toString() {
        return "Product{ " +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", detailOther='" + detailOther + '\'' +
                '}';
    }
}
