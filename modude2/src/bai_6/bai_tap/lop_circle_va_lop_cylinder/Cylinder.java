package bai_6.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(double height) {
        return height * super.getArea(getRadius());
    }

    @Override
    public String toString() {
        return "A Circle with height = " +
                getHeight() +
                ", which is a subclass of " +
                super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Cylinder(5.0, 4.0, "blue");
        System.out.println(circle);
    }
}
