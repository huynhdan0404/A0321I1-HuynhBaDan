package case_study.FuramaResort.controllers;

import case_study.FuramaResort.services.*;

import java.util.Scanner;

public class FuramaController {

    public static void displayMainMenu(){
        try {
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
                    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
                    employeeService.displayMenuEmployee();
                    displayMainMenu();
                    break;
                case 2:
                    CustomerServiceImpl customerService = new CustomerServiceImpl();
                    customerService.displayMenuCustomer();
                    displayMainMenu();
                    break;
                case 3:
                    FacilityServiceImpl facilityService = new FacilityServiceImpl();
                    facilityService.displayMenuFacility();
                    displayMainMenu();
                    break;
                case 4:
                    //booking + contact
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new constracts");
                    System.out.println("4. Display list contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
                    choice = scanner.nextInt();
                    BookingServiceImpl bookingService = new BookingServiceImpl();
                    ContactServiceImpl contactService = new ContactServiceImpl();
                    switch (choice) {
                        case 1:
                            bookingService.addNew();
                            break;
                        case 2:
                            bookingService.displayElement();
                            break;
                        case 3:
                            contactService.addNew();
                            break;
                        case 4:
                            contactService.displayElement();
                            break;
                        case 5:
                            break;
                        default:
                            break;
                    }
                    displayMainMenu();
                    break;
                case 5:
                    PromotionServiceImpl promotionService = new PromotionServiceImpl();
                    promotionService.displayMenu();
                    displayMainMenu();
                case 6:
                    displayMainMenu();
                    break;
                default:
                    displayMainMenu();
                    break;
            }
        }catch (Exception e){
            displayMainMenu();
        }
    }
    public static void main(String[] args) {
        displayMainMenu();
    }
}
