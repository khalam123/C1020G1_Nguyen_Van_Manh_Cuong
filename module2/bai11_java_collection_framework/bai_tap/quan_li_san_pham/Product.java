package bai11_java_collection_framework.bai_tap.quan_li_san_pham;

public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private int price;
   // private String infor;

//    public String getInfor() {
//        return infor;
//    }
//
//    public void setInfor(String infor) {
//        this.infor = infor;
//    }

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
      //  this.infor = infor;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", price = " + price +
//                ", infor = '" + infor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.price - o.getPrice();
    }
}
