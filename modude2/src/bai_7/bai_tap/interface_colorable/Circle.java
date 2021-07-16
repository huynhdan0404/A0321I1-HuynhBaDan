package bai_7.bai_tap.interface_colorable;

public class Circle extends Shape {
    private double radius;

    public Circle(){}

    @Override
    public double Area() {
        return radius * radius * Math.PI;
    }

    ;

    public  Circle(String color,Boolean filled,double radius){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "radius = " + getRadius();
    }
}
