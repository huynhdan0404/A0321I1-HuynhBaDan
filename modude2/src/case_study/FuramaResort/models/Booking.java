package case_study.FuramaResort.models;

public class Booking {
    private double maBooking;
    private int ngayBatDau;
    private int ngayKetThuc;
    private String tenDichVu;
    private String loaiDichvu;
    private double maKhachHang;

    public Booking() {

    }

    public Booking(double maBooking, int ngayBatDau, int ngayKetThuc, String tenDichVu, String loaiDichvu, double maKhachHang) {
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

    public void setMaBooking(double maBooking) {
        this.maBooking = maBooking;
    }

    public int getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(int ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public int getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(int ngayKetThuc) {
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

    public void setMaKhachHang(double maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
}
