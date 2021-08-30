package case_study.FuramaResort.models;

public class Customer extends Person{
    private int maKhachHang;
    private String loaiKhach;
    private String diaChi;

    public Customer(){

    }

    public Customer(int maKhachHang, String loaiKhach, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer(String hoTen, String ngaySinh, String gioiTinh, int soCMND, int soSDT, String email, int maKhachHang, String loaiKhach, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soSDT, email);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public double getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "maKhachHang=" + maKhachHang +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                "} " + super.toString();
    }
}
