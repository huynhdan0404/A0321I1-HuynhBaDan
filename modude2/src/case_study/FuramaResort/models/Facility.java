package case_study.FuramaResort.models;

public abstract class Facility {
    private String tenDichvu;
    private String dienTich;
    private double chiPhi;
    private int soNguoi;
    private String kieuThue;

    public Facility(){
    }

    public Facility(String tenDichvu, String dienTich, double chiPhi, int soNguoi, String kieuThue) {
        this.tenDichvu = tenDichvu;
        this.dienTich = dienTich;
        this.chiPhi = chiPhi;
        this.soNguoi = soNguoi;
        this.kieuThue = kieuThue;
    }

    public String getTenDichvu() {
        return tenDichvu;
    }

    public void setTenDichvu(String tenDichvu) {
        this.tenDichvu = tenDichvu;
    }

    public String getDienTich() {
        return dienTich;
    }

    public void setDienTich(String dienTich) {
        this.dienTich = dienTich;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }
}
