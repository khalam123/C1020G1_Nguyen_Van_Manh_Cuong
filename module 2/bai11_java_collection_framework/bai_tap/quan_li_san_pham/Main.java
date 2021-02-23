package bai11_java_collection_framework.bai_tap.quan_li_san_pham;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.addProduct();
        productManager.addProduct();
        productManager.addProduct();
       // productManager.displayProduct();
        System.out.println();
//        productManager.editProduct();
//        productManager.displayProduct();
  //      productManager.deleteProduct();
//        productManager.displayProduct();
       // productManager.searchProduct();
        productManager.sort();
        productManager.displayProduct();


    }
}
