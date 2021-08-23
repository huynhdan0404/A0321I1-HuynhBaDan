package case_study.FuramaResort.models;

public class Villa extends Facility {
    private int tieuChuanPhong;
    private int dienTichHoBoi;
    private int soTang;

    public Villa(){

    }

    public Villa(int tieuChuanPhong, int dienTichHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String tenDichvu, int dienTich, int chiPhi, int soNguoi, int tieuChuanPhong, int dienTichHoBoi, int soTang) {
        super(tenDichvu, dienTich, chiPhi, soNguoi);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public int getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(int tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(int dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong=" + tieuChuanPhong +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                "} " + super.toString();
    }
}
