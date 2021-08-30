package case_study.FuramaResort.models;

import java.io.Serializable;

public class Facility implements Serializable {
    private String tenDichvu;
    private int dienTich;
    private int chiPhi;
    private int soNguoi;

    public Facility(){
    }

    public Facility(String tenDichvu, int dienTich, int chiPhi, int soNguoi) {
        this.tenDichvu = tenDichvu;
        this.dienTich = dienTich;
        this.chiPhi = chiPhi;
        this.soNguoi = soNguoi;
    }

    public String getTenDichvu() {
        return tenDichvu;
    }

    public void setTenDichvu(String tenDichvu) {
        this.tenDichvu = tenDichvu;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(int chiPhi) {
        this.chiPhi = chiPhi;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "tenDichvu='" + tenDichvu + '\'' +
                ", dienTich=" + dienTich +
                ", chiPhi=" + chiPhi +
                ", soNguoi=" + soNguoi +
                '}';
    }
}
