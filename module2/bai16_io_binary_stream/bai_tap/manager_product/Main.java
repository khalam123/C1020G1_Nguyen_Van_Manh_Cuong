package bai16_io_binary_stream.bai_tap.manager_product;

import java.io.*;

public class Main  {
    static Product product1 = new Product(1,"milk","VinaMilk",7000,"No sugar");
    static Product product2 = new Product(2,"milk","VinaMilk",7000,"Less sugar");
    static Product product3 = new Product(3,"milk","VinaMilk",7000,"Has sugar");

    public static void main(String[] args) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("src/bai16_io_binary_stream/bai_tap/manager_product/product.csv"));
            objectOutputStream.writeObject(product1);
            objectOutputStream.writeObject(product2);
            objectOutputStream.writeObject(product3);
            objectOutputStream.close();
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("src/bai16_io_binary_stream/bai_tap/manager_product/product.csv"));
            Product product = null;
            do {
                product = (Product) objectInputStream.readObject();
                System.out.println(product);
            } while (product != null);
        }catch (EOFException e){
            System.out.println("Da doc het file");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
