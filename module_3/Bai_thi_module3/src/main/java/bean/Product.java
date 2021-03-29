package bean;

public class Product {
    private int product_id;
    private String product_name;
    private int product_price;
    private int product_discount;
    private int product_stock;

    public Product() {
    }

    public Product(int product_id, String product_name, int product_price, int product_discount, int product_stock) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_discount = product_discount;
        this.product_stock = product_stock;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public int getProduct_discount() {
        return product_discount;
    }

    public void setProduct_discount(int product_discount) {
        this.product_discount = product_discount;
    }

    public int getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(int product_stock) {
        this.product_stock = product_stock;
    }
}
