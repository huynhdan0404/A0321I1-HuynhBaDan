package case_study.FuramaResort.services;

import case_study.FuramaResort.models.Customer;
import case_study.FuramaResort.utils.ReadAndWrite;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    private  Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList;
    private  int choice;

    static {
        customerList = new ArrayList<>();
    }

    public void displayMenuCustomer() throws IOException {
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return main menu");
        System.out.println("mời bạn chọn");
        try {
            choice = scanner.nextInt();
        }catch (Exception e){
            System.out.println("bạn đã nhập sai định dạng");
        }
        switch (choice) {
            case 1:
                displayElement();
                break;
            case 2:
                addNew();
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

    @Override
    public void displayElement() throws IOException {
        customerList = (List<Customer>) ReadAndWrite.read("D:\\A0321I1-HuynhBaDan\\modude2\\src\\case_study\\FuramaResort\\data\\Customer.csv");
        if (customerList.size() == 0) {
            System.out.println("chưa có khách hàng nào, hãy thêm khách hàng của bạn vào");
        } else {
            for (Customer customer :
                    customerList) {
                System.out.println(customer);
            }
        }
    }

    @Override
    public void addNew() {
        Customer customer = new Customer();
        System.out.println("nhập thông tin khách hàng");
        System.out.println("nhập họ và tên khách hàng: ");
        scanner.nextLine();
        customer.setHoTen(scanner.nextLine());

        System.out.println("nhập giới tính khách hàng: ");
        customer.setGioiTinh(scanner.nextLine());

        System.out.println("nhập email khách hàng: ");
        customer.setEmail(scanner.nextLine());

        System.out.println("nhập ngày sinh khách hàng: ");
        customer.setNgaySinh(scanner.nextLine());

        System.out.println("Loại khách hàng");
        customer.setLoaiKhach(scanner.nextLine());

        System.out.println("Địa chỉ khách hàng");
        customer.setDiaChi(scanner.nextLine());

        try {
            System.out.println("nhập số CMDN khách hàng: ");
            customer.setSoCMND(scanner.nextInt());
        }catch (Exception e){
            System.out.println("bạn đã nhập sai định dạng mời bạn nhập lại");
        }

        try {
            System.out.println("nhập số điện thoại khách hàng: ");
            customer.setSoSDT(scanner.nextInt());
        }catch (Exception e){
            System.out.println("bạn đã nhập sai định dạng mời bạn nhập lại");
        }

        try {
            System.out.println("mã khách hàng");
            customer.setMaKhachHang(scanner.nextInt());
        }catch (Exception e){
            System.out.println("bạn đã nhập sai định dạng mời bạn nhập lại");
        }

        customerList.add(customer);
        ReadAndWrite.write(customerList,"D:\\A0321I1-HuynhBaDan\\modude2\\src\\case_study\\FuramaResort\\data\\Customer.csv");
    }

    @Override
    public void exitCustomer() throws IOException {
        customerList = (List<Customer>) ReadAndWrite.read("D:\\A0321I1-HuynhBaDan\\modude2\\src\\case_study\\FuramaResort\\data\\Customer.csv");
        for (Customer customer : customerList){
            System.out.println(customer);
        }
        int maKhachHang;
        boolean check = true;
        while (check){
            System.out.println("nhập mã khách hàng");
            maKhachHang = scanner.nextInt();
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getMaKhachHang() == maKhachHang) {
                    customerList.remove(i);
                    check = false;
                    break;
                } else {
                    System.out.println("không tìm thấy mã nhân viên tương ứng");
                }
            }
        }
        ReadAndWrite.write(customerList,"D:\\A0321I1-HuynhBaDan\\modude2\\src\\case_study\\FuramaResort\\data\\Customer.csv");
    }
}
