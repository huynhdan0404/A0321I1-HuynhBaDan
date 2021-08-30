package case_study.FuramaResort.models;

public abstract class Person {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private int soCMND;
    private int soSDT;
    private String email;

    public Person(){

    }

    public Person(String hoTen, String ngaySinh, String gioiTinh, int soCMND, int soSDT, String email) {
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
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

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public double getSoSDT() {
        return soSDT;
    }

    public void setSoSDT(int soSDT) {
        this.soSDT = soSDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soCMND=" + soCMND +
                ", soSDT=" + soSDT +
                ", email='" + email + '\'' +
                '}';
    }
}
