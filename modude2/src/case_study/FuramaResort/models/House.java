package case_study.FuramaResort.models;

public class House extends Facility {
    private int tieuChuanPhong;
    private int soTang;

    public House(){

    }

    public House(int tieuChuanPhong, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House(String tenDichvu, String dienTich, double chiPhi, int soNguoi, String kieuThue, int tieuChuanPhong, int soTang) {
        super(tenDichvu, dienTich, chiPhi, soNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public int getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(int tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
}
