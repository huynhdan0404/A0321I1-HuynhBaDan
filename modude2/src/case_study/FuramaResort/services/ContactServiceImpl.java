package case_study.FuramaResort.services;

import case_study.FuramaResort.models.Booking;
import case_study.FuramaResort.models.Contract;

import java.util.*;

public class ContactServiceImpl implements ContactService {
    private Scanner scanner = new Scanner(System.in);
    static List<Contract> contractList = new ArrayList<>();


    @Override
    public void addNew() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        Booking booking = bookingQueue.poll();
        Contract contract = new Contract();

        System.out.println("Tạo hợp đồng với khách hàng có mã: " + booking.getMaKhachHang() + "\n" +
                "mã Booking: " + booking.getMaBooking());
        System.out.println("Nhập số hợp đồng: ");
        contract.setSoHopDong(scanner.nextInt());

        System.out.println("Nhập số tiền đặt cọc: ");
        contract.setSoTienDatCoc(scanner.nextInt());

        System.out.println("Nhâp tổng tiền: ");
        contract.setTongTien(scanner.nextInt());

        contract.setMaBooking((int) booking.getMaBooking());
        contract.setMaKhachHang((int) booking.getMaKhachHang());

        contractList.add(contract);
    }

    @Override
    public void displayElement() {
        for (Contract contract : contractList){
            System.out.println(contract);
        }
    }

    @Override
    public void ExitContact() {
        for (Contract contract : contractList){
            System.out.println(contract);
        }
        boolean check = true;
        while (check){
            System.out.println("nhập số hợp đồng: ");
            int soHopDong = scanner.nextInt();
            for (Contract contract : contractList){
                if (soHopDong == contract.getSoHopDong()){
                    check = false;
                    break;
                }
            }
        }
    }
}
