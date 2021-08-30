package case_study.FuramaResort.services;

import case_study.FuramaResort.models.Employee;
import case_study.FuramaResort.utils.ReadAndWrite;
import com.sun.scenario.effect.impl.state.AccessHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private  Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList;
    private int choice;

    static {
        employeeList = new ArrayList<>();
    }

    public void displayMenuEmployee() throws IOException {
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
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
                exitEmployee();
                break;
            case 4:
                break;
            default:
                break;
        }
    }

    @Override
    public void displayElement() throws IOException {
        employeeList = (List<Employee>) ReadAndWrite.read("D:\\A0321I1-HuynhBaDan\\modude2\\src\\case_study\\FuramaResort\\data\\Employee.csv");

        if (employeeList.size() == 0) {
            System.out.println("chưa có nhân viên nào, hãy thêm nhân viên của bạn vào");
        } else {
            for (Employee employee :
                    employeeList) {
                System.out.println(employee);
            }
        }
    }

    @Override
    public void addNew() {
        Employee employee = new Employee();
        System.out.println("nhập thông tin nhân viên");
        System.out.println("nhập họ và tên nhân viên: ");
        scanner.nextLine();
        employee.setHoTen(scanner.nextLine());

        System.out.println("nhập giới tính nhân viên: ");
        employee.setGioiTinh(scanner.nextLine());

        System.out.println("nhập email nhân viên: ");
        employee.setEmail(scanner.nextLine());

        System.out.println("nhập ngày sinh nhân viên: ");
        employee.setNgaySinh(scanner.nextLine());

        System.out.println("trình độ");
        employee.setTrinhDo(scanner.nextLine());

        System.out.println("vị trí");
        employee.setViTri(scanner.nextLine());

        try {
            System.out.println("nhập số CMDN nhân viên: ");
            employee.setSoCMND(scanner.nextInt());
        }catch (Exception e){
            System.out.println("bạn đã nhập sai định dạng mời bạn nhập lại");
        }

        try {
            System.out.println("nhập số điện thoại nhân viên: ");
            employee.setSoSDT(scanner.nextInt());
        }catch (Exception e){
            System.out.println("bạn đã nhập sai định dạng mời bạn nhập lại");
        }

        try {
            System.out.println("mã nhân viên");
            employee.setMaNhanVien(scanner.nextInt());
        }catch (Exception e){
            System.out.println("bạn đã nhập sai định dạng mời bạn nhập lại");
        }

        try {
            System.out.println("lương");
            employee.setLuong(scanner.nextInt());
        }catch (Exception e){
            System.out.println("bạn đã nhập sai định dạng mời bạn nhập lại");
        }

        employeeList.add(employee);
        ReadAndWrite.write(employeeList,"D:\\A0321I1-HuynhBaDan\\modude2\\src\\case_study\\FuramaResort\\data\\Employee.csv");
    }

    @Override
    public void exitEmployee() {
        int maNhanVien = 0;
        for (Employee element : employeeList){
            System.out.println(element);
        }
        boolean check = true;
        while (check){
            try {
                System.out.println("nhập mã nhân viên");
                maNhanVien = scanner.nextInt();
            }catch (Exception e){
                System.out.println("bạn đã nhập sai định dạng mời bạn nhập lại");
            }
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getMaNhanVien() == maNhanVien) {
                    employeeList.remove(i);
                    check = false;
                    break;
                } else {
                    System.out.println("không tìm thấy mã nhân viên tương ứng");
                }
            }
        }

    }
}
