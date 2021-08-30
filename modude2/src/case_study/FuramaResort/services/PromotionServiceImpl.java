package case_study.FuramaResort.services;

import case_study.FuramaResort.models.Booking;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class PromotionServiceImpl implements PromotionService {
    private Scanner scanner = new Scanner(System.in);
    static Stack<Booking> bookingStack = new Stack<>();
    static {
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet){
            bookingStack.push(booking);
        }
    }

    public void displayMenu(){
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
        System.out.println("mời bạn chọn");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                displayElement();
                break;
            case 2:
                addNew();
                break;
            case 3:
                break;
            default:
                break;
        }
    }
@Override
    public void addNew() {
        System.out.println("số lượng voucher là: " + bookingStack.size());
        System.out.println("số lượng voucher 10%: ");
        int voucher10 = scanner.nextInt();
        System.out.println("số lượng voucher 20%: ");
        int voucher20 = scanner.nextInt();
        System.out.println("số lượng voucher 50% là: " + (bookingStack.size() - (voucher10 + voucher20)));
        int voucher50 = bookingStack.size() - (voucher10 + voucher20);

        System.out.println("danh sách khách hàng nhận voucher 10%");
        for (int i = 0;i < voucher10;i++){
            System.out.println(bookingStack.pop());
        }

        System.out.println("danh sách khách hàng nhận voucher 20%");
        for (int i = 0;i < voucher20;i++){
            System.out.println(bookingStack.pop());
        }

        System.out.println("danh sách khách hàng nhận voucher 50%");
        for (int i = 0;i < voucher50;i++){
            System.out.println(bookingStack.pop());
        }
    }

    @Override
    public void displayElement() {
        if (bookingStack.size() == 0){
            System.out.println("dsdas");
        }else {
           for (Booking booking : bookingStack){
               System.out.println(booking);
           }
        }
    }
}
