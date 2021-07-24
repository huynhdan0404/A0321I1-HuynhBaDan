package case_study.FuramaResort.models;

public class Room extends Facility{
    private String dichVuKemTheo;

    public Room(){

    }

    public Room(String dichVuKemTheo) {
        this.dichVuKemTheo = dichVuKemTheo;
    }

    public Room(String tenDichvu, String dienTich, double chiPhi, int soNguoi, String kieuThue, String dichVuKemTheo) {
        super(tenDichvu, dienTich, chiPhi, soNguoi, kieuThue);
        this.dichVuKemTheo = dichVuKemTheo;
    }

    public String getDichVuKemTheo() {
        return dichVuKemTheo;
    }

    public void setDichVuKemTheo(String dichVuKemTheo) {
        this.dichVuKemTheo = dichVuKemTheo;
    }
}
