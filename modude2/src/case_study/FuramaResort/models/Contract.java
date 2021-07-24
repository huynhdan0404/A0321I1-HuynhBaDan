package case_study.FuramaResort.models;

public class Contract {
    private int soHopDong;
    private double maBooking;
    private double soTienDatCoc;
    private double tongTien;
    private double maKhachHang;

    public Contract(){}

    public Contract(int soHopDong, double maBooking, double soTienDatCoc, double tongTien, double maKhachHang) {
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

    public void setMaBooking(double maBooking) {
        this.maBooking = maBooking;
    }

    public double getSoTienDatCoc() {
        return soTienDatCoc;
    }

    public void setSoTienDatCoc(double soTienDatCoc) {
        this.soTienDatCoc = soTienDatCoc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public double getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(double maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
}
