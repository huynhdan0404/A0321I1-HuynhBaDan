package case_study.FuramaResort.models;

public class Employee extends Person{
    private double maNhanVien;
    private String trinhDo;
    private String viTri;
    private double Luong;

    public Employee (){

    }

    public Employee(double maNhanVien, String trinhDo, String viTri, double luong) {
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        Luong = luong;
    }

    public Employee(String hoTen, int ngaySinh, String gioiTinh, double soCMND, double soSDT, String email, double maNhanVien, String trinhDo, String viTri, double luong) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soSDT, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        Luong = luong;
    }

    public double getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(double maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double luong) {
        Luong = luong;
    }
}
