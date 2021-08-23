package case_study.FuramaResort.services;

import case_study.FuramaResort.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList;
    private static int maNhanVien;
    private static String trinhDo;
    private static String viTri;
    private static int luong;
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;

    static {
        employeeList = new ArrayList<>();
    }

    public static void displayMenuEmployee() {
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Return main menu");
        System.out.println("mời bạn chọn");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                displayEmployee();
                break;
            case 2:
                addEmployee();
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

    public static void displayEmployee() {
        if (employeeList.size() == 0) {
            System.out.println("chưa có nhân viên nào, hãy thêm nhân viên của bạn vào");
        } else {
            for (Employee employee :
                    employeeList) {
                System.out.println(employee);
            }
        }
    }

    public static void addEmployee() {
        System.out.println("nhập thông tin nhân viên");
        System.out.println("mã nhân viên");
        maNhanVien = scanner.nextInt();

        System.out.println("trình độ");
        scanner.nextLine();
        trinhDo = scanner.nextLine();

        System.out.println("vị trí");
        viTri = scanner.nextLine();

        System.out.println("lương");
        luong = scanner.nextInt();
        employeeList.add(new Employee(maNhanVien, trinhDo, viTri, luong));
    }

    public static void exitEmployee() {
        System.out.println("nhập mã nhân viên");
        maNhanVien = scanner.nextInt();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getMaNhanVien() == maNhanVien) {
                employeeList.remove(i);
                break;
            } else {
                System.out.println("không tìm thấy mã nhân viên tương ứng");
            }
        }
    }
}
