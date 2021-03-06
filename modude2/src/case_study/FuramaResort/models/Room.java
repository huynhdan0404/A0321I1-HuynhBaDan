package case_study.FuramaResort.models;

public class Room extends Facility{
    private String dichVuKemTheo;

    public Room(){

    }

    public Room(String dichVuKemTheo) {
        this.dichVuKemTheo = dichVuKemTheo;
    }

    public Room(String tenDichvu, int dienTich, int chiPhi, int soNguoi, String dichVuKemTheo) {
        super(tenDichvu, dienTich, chiPhi, soNguoi);
        this.dichVuKemTheo = dichVuKemTheo;
    }

    public String getDichVuKemTheo() {
        return dichVuKemTheo;
    }

    public void setDichVuKemTheo(String dichVuKemTheo) {
        this.dichVuKemTheo = dichVuKemTheo;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuKemTheo='" + dichVuKemTheo + '\'' +
                "} " + super.toString();
    }
}
