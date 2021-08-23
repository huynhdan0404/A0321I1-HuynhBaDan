package case_study.FuramaResort.services;

import case_study.FuramaResort.models.Customer;
import case_study.FuramaResort.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    private static List<Customer> customerList;
    private static int maKhachHang;
    private static String loaiKhach;
    private static String diaChi;
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;

    static {
        customerList = new ArrayList<>();
    }

    public static void displayMenuCustomer() {
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return main menu");
        System.out.println("mời bạn chọn");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                displayCustomer();
                break;
            case 2:
                addCustomer();
                break;
            case 3:
                exitCustomer();
                break;
            case 4:
                break;
            default:
                break;
        }
    }

    public static void displayCustomer() {
        if (customerList.size() == 0) {
            System.out.println("chưa có khách hàng nào, hãy thêm khách hàng của bạn vào");
        } else {
            for (Customer customer :
                    customerList) {
                System.out.println(customer);
            }
        }
    }

    public static void addCustomer() {
        System.out.println("nhập thông tin khách hàng");
        System.out.println("mã khách hàng");
        maKhachHang = scanner.nextInt();

        System.out.println("Loại khách hàng");
        scanner.nextLine();
        loaiKhach = scanner.nextLine();

        System.out.println("Địa chỉ khách hàng");
        diaChi = scanner.nextLine();

        customerList.add(new Customer(maKhachHang,loaiKhach,diaChi));
    }

    public static void exitCustomer() {
        System.out.println("nhập mã khách hàng");
        maKhachHang = scanner.nextInt();
        boolean check = true;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getMaKhachHang() == maKhachHang) {
                customerList.remove(i);
                break;
            } else {
               check = false;
            }
        }
        if (check == false){
            System.out.println("không tìm thấy mã nhân viên tương ứng");
        }
    }
}
