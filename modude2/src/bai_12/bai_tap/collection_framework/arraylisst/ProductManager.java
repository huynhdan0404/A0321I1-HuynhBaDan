package bai_12.bai_tap.collection_framework.arraylisst;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static List<Product> productList;
    private static Scanner scanner = new Scanner(System.in);

    static {
        productList = new ArrayList<>();
        productList.add(new Product(1, "Iphone", 100));
        productList.add(new Product(2, "Samsung", 100));
        productList.add(new Product(3, "Google", 100));
    }

    public static void displayMenu() {
        int choice = -1;
        do {
            System.out.println("Please enter choice \n"
                    + "1. Display product list \n"
                    + "2. Add product \n"
                    + "3. Update product \n"
                    + "4. Delete product \n"
                    + "5. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayListProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }

    public static void displayListProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static void addProduct() {
        int id;
        do {
            System.out.println("Please enter id");
            id = scanner.nextInt();
        } while (findById(id) != null);
        scanner.skip("\\R");
        System.out.println("please enter name");
        String name = scanner.nextLine();
        System.out.println("Please enter price");
        double price = scanner.nextDouble();
        productList.add(new Product(id, name, price));
    }

    public static Product findById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public static void updateProduct() {
        System.out.println("Please enter id");
        int id = scanner.nextInt();
        Product product = findById(id);
        if (product != null) {
            System.out.println("Please enter information Update: \n"
                    + "1. Name product \n"
                    + "2. Price product \n"
                    + "3, Back to menu");
            int choice = scanner.nextInt();
            scanner.skip("\\R");
            switch (choice) {
                case 1:
                    System.out.println("Please enter name");
                    String name = scanner.nextLine();
                    product.setNameProduct(name);
                    displayMenu();
                    break;
                case 2:
                    break;
                case 3:
                    displayMenu();
                    break;
            }
        } else {
            System.out.println("Id not found");
            updateProduct();
        }
    }

    public static void deleteProduct() {
        System.out.println("please enter id product");
        int id = scanner.nextInt();
        productList.remove(findById(id));
    }
}
