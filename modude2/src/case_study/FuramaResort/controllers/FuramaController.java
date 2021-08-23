package case_study.FuramaResort.controllers;

import case_study.FuramaResort.services.CustomerServiceImpl;
import case_study.FuramaResort.services.EmployeeServiceImpl;
import case_study.FuramaResort.services.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {

    public static void displayMainMenu(){
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management ");
        System.out.println("4. Booking Managerment");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        System.out.println("mời bạn chọn");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                EmployeeServiceImpl employees = new EmployeeServiceImpl();
                employees.displayMenuEmployee();
                displayMainMenu();
                break;
            case 2:
                CustomerServiceImpl customers = new CustomerServiceImpl();
                customers.displayMenuCustomer();
                displayMainMenu();
                break;
            case 3:
                FacilityServiceImpl facilityServices = new FacilityServiceImpl();
                facilityServices.displayMenuFacility();
                displayMainMenu();
                break;
            case 4:
                System.out.println("1. Add new booking");
                System.out.println("2. Display list booking");
                System.out.println("3. Create new constracts");
                System.out.println("4. Display list contracts");
                System.out.println("5. Edit contracts");
                System.out.println("6. Return main menu");
                displayMainMenu();
                break;
            case 5:
                System.out.println("1. Display list customers use service");
                System.out.println("2. Display list customers get voucher");
                System.out.println("3. Return main menu");
                displayMainMenu();
            case 6:
                displayMainMenu();
                break;
            default:
                displayMainMenu();
                break;
        }
    }
    public static void main(String[] args) {
        displayMainMenu();
    }
}
