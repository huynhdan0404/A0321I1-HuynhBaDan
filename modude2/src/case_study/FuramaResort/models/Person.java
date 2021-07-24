package case_study.FuramaResort.models;

public abstract class Person {
    private String hoTen;
    private int ngaySinh;
    private String gioiTinh;
    private double soCMND;
    private double soSDT;
    private String email;

    public Person(){

    }

    public Person(String hoTen, int ngaySinh, String gioiTinh, double soCMND, double soSDT, String email) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soSDT = soSDT;
        this.email = email;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(double soCMND) {
        this.soCMND = soCMND;
    }

    public double getSoSDT() {
        return soSDT;
    }

    public void setSoSDT(double soSDT) {
        this.soSDT = soSDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
