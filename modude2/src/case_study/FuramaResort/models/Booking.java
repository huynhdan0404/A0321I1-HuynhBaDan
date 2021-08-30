package case_study.FuramaResort.models;

import java.io.Serializable;

public class Booking implements Serializable {
    private int maBooking;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String tenDichVu;
    private String loaiDichvu;
    private int maKhachHang;

    public Booking() {

    }

    public Booking(int maBooking, String ngayBatDau, String ngayKetThuc, String tenDichVu, String loaiDichvu, int maKhachHang) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.tenDichVu = tenDichVu;
        this.loaiDichvu = loaiDichvu;
        this.maKhachHang = maKhachHang;
    }

    public double getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public CharSequence getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public CharSequence getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getLoaiDichvu() {
        return loaiDichvu;
    }

    public void setLoaiDichvu(String loaiDichvu) {
        this.loaiDichvu = loaiDichvu;
    }

    public double getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking=" + maBooking +
                ", ngayBatDau='" + ngayBatDau + '\'' +
                ", ngayKetThuc='" + ngayKetThuc + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", loaiDichvu='" + loaiDichvu + '\'' +
                ", maKhachHang=" + maKhachHang +
                '}';
    }
}
