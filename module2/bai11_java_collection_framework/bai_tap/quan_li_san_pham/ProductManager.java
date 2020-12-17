package bai11_java_collection_framework.bai_tap.quan_li_san_pham;

import java.util.*;

public class ProductManager{
    private Product product;
//    private static int choose;
    List<Product> productsList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addProduct(){
        int id = (productsList.size()>0)? (productsList.size()+1): 1;
        System.out.print("Enter name product: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        int price = Integer.parseInt(scanner.nextLine());
//        System.out.println("Enter information product: ");
//        String infor = scanner.next();
        productsList.add(new Product(id,name,price));
    }

    public void editProduct(){
        System.out.print("Enter id wanna edit: ");
        int id = scanner.nextInt();
        for (Product value : productsList) {
            if (value.getId() == id) {
                DO_1:
               do{
                   System.out.print(" 1. Edit name product. \n 2. Edit price product. \n 3. Edit all. \n 0.Quit \nChoose: ");
                   int choose = scanner.nextInt();
                   switch (choose) {
                        case 1:
                            System.out.print("Edit name product: ");
                            scanner.nextLine();
                            String name = scanner.nextLine();
                            value.setName(name);
                            break DO_1;
                        case 2:
                            System.out.print("Edit price product: ");
                            int price = scanner.nextInt();
                            value.setPrice(price);
                            break DO_1;
                        case 3:
                            System.out.print("Edit name product: ");
                            scanner.nextLine();
                            name = scanner.nextLine();
                            value.setName(name);
                            System.out.print("Edit price product: ");
                            price = scanner.nextInt();
                            value.setPrice(price);
                            break DO_1;
                        case 0:
                            break DO_1;
                    }
                }while(true);
            }
        }
    }
    public void deleteProduct(){
        System.out.print("Enter id wanna delete: ");
        int id = scanner.nextInt();
        productsList.removeIf(value -> value.getId() == id);
    }
    public void searchProduct(){
        System.out.print("Enter id production wanna search: ");
        int id = scanner.nextInt();
        for (Product value : productsList) {
            if (value.getId() == id) {
                System.out.println(value);
            }
        }
    }
    public void displayProduct(){
        for (Product element: productsList)
            System.out.println(element);
    }
    public  void sort(){
        Collections.sort(productsList);
    }
}
