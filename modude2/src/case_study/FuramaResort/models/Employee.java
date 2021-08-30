package case_study.FuramaResort.models;

import java.io.Serializable;

public class Employee extends Person implements Serializable{
    private int maNhanVien;
    private String trinhDo;
    private String viTri;
    private int luong;

    public Employee (){

    }

    public Employee(int maNhanVien, String trinhDo, String viTri, int luong) {
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(String hoTen, String ngaySinh, String gioiTinh, int soCMND, int soSDT, String email, int maNhanVien, String trinhDo, String viTri, int luong) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soSDT, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
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

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "maNhanVien=" + maNhanVien +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                "} " + super.toString();
    }
}
