package case_study.FuramaResort.models;

import java.io.Serializable;

public class Contract implements Serializable {
    private int soHopDong;
    private int maBooking;
    private int soTienDatCoc;
    private int tongTien;
    private int maKhachHang;

    public Contract() {
    }

    public Contract(int soHopDong, int maBooking, int soTienDatCoc, int tongTien, int maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienDatCoc = soTienDatCoc;
        this.tongTien = tongTien;
        this.maKhachHang = maKhachHang;
    }

    public int getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public double getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public double getSoTienDatCoc() {
        return soTienDatCoc;
    }

    public void setSoTienDatCoc(int soTienDatCoc) {
        this.soTienDatCoc = soTienDatCoc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public double getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "soHopDong=" + soHopDong +
                ", maBooking=" + maBooking +
                ", soTienDatCoc=" + soTienDatCoc +
                ", tongTien=" + tongTien +
                ", maKhachHang=" + maKhachHang +
                '}';
    }
}
