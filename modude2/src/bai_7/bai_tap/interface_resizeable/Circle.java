package bai_7.bai_tap.interface_resizeable;

public class Circle extends Shape implements Resizeable{
    private double radius;

    public Circle(){};

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

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void resize(double percent) {
    setRadius(getRadius() * percent);

    }

    @Override
    public String toString() {
        return super.toString() +
                "radius = " + getRadius();
    }

//    public static void main(String[] args) {
//        Shape shape = new Circle("blue",true,3.0);
//        ((Circle)shape).resize(5);
//        System.out.println(shape);
//    }
}
