package case_study.FuramaResort.services;

import case_study.FuramaResort.models.Booking;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingCompartor implements Comparator<Booking>, Serializable {

    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngayBatDau1 = LocalDate.parse(o1.getNgayBatDau(), formatter);
        LocalDate ngayBatDau2 = LocalDate.parse(o2.getNgayBatDau(), formatter);
        LocalDate ngayKetThuc1 = LocalDate.parse(o2.getNgayKetThuc(), formatter);
        LocalDate ngayKetThuc2 = LocalDate.parse(o2.getNgayKetThuc(), formatter);

        if (ngayBatDau1.compareTo(ngayBatDau2) > 0){
            return 1;
        }else if (ngayBatDau1.compareTo(ngayBatDau2) < 0){
            return -1;
        }else {
            if (ngayKetThuc1.compareTo(ngayKetThuc2) > 0){
                return 1;
            }else if (ngayKetThuc1.compareTo(ngayKetThuc2) < 0){
                return -1;
            }else {
                return 1;
            }
        }
    }
}
