package case_study.FuramaResort.services;

import case_study.FuramaResort.controllers.FuramaController;
import case_study.FuramaResort.models.Booking;
import case_study.FuramaResort.models.Customer;
import case_study.FuramaResort.models.Facility;

import java.util.*;

public class BookingServiceImpl implements BookingService{
    String tenDichVu = "";
    private Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingCompartor());

    public Set<Booking> sendBooking(){
        return bookingSet;
    }
    @Override
    public void addNew() {
        Booking booking = new Booking();

        booking.setMaKhachHang(chooseCustomer());
        booking.setTenDichVu(chooseFacility());

        System.out.println("nhập mã booking: ");
        booking.setMaBooking(scanner.nextInt());

        System.out.println("nhập ngày bắt đầu thuê: ");
        scanner.nextLine();
        booking.setNgayBatDau(scanner.nextLine());

        System.out.println("nhập ngày kết thúc thuê: ");
        booking.setNgayKetThuc(scanner.nextLine());

        System.out.println("nhập loại dịch vụ: ");
        booking.setLoaiDichvu(scanner.nextLine());




        bookingSet.add(booking);

        //số lần sử dụng của dịch vụ tăng 1
        for (Map.Entry<Facility,Integer> facilityIntegerEntry : FacilityServiceImpl.facilityIntegerMap.entrySet()){
            if (facilityIntegerEntry.getKey().getTenDichvu().equals(tenDichVu)){
               FacilityServiceImpl.facilityIntegerMap.put(facilityIntegerEntry.getKey(),facilityIntegerEntry.getValue() + 1);
            }
        }
    }

    @Override
    public void displayElement() {
        for (Booking booking : bookingSet){
            System.out.println(booking);
        }
    }


    public int chooseCustomer(){
        if (CustomerServiceImpl.customerList.size() == 0){
            System.out.println("chưa có khách hàng nào");
            FuramaController.displayMainMenu();
        }else {
            for (Customer customer : CustomerServiceImpl.customerList){
                System.out.println(customer);
            }
        }
        int maKhachHang = 0;
        boolean check = true;
        while (check){
            System.out.println("vui lòng nhập mã khách hàng: ");
            maKhachHang = scanner.nextInt();
            for (Customer customer : CustomerServiceImpl.customerList){
                if (maKhachHang == customer.getMaKhachHang()){
                    check = false;
                    break;
                }
            }
        }
        return maKhachHang;
    }

    public String chooseFacility(){
        for (Map.Entry entry : FacilityServiceImpl.facilityIntegerMap.entrySet()){
            System.out.println(entry);
        }
//        String tenDichVu = "";
        boolean check = true;
        while (check){
            System.out.println("vui lòng nhập tên dịch vụ: ");
            tenDichVu = scanner.nextLine();
            for (Facility facility : FacilityServiceImpl.facilityIntegerMap.keySet()){
                if (tenDichVu.equals(facility.getTenDichvu())){
                    check = false;
                    break;
                }
            }

        }
        return tenDichVu;
    }

}
