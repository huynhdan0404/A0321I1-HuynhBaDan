package bai_7.bai_tap.interface_resizeable;

import bai_5.thuc_hanh.access_modifier.pack.B;

public class Rectangle extends Shape implements Resizeable{
    private double height;
    private double width;

    public Rectangle (){}

    public Rectangle (String color, boolean filled,double height,double width){
        super(color,filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double Area (){
        return height * width;
    }

    @Override
    public void resize(double percent) {
        setHeight(getHeight() * percent);
        setWidth(getWidth() * percent);
    }

    @Override
    public String toString() {
        return super.toString() +
                " height = " + getHeight() +
                " width = " + getWidth();
    }

//    public static void main(String[] args) {
//        Shape rectangle = new Rectangle("red",true,4.0,8.0);
//        ((Rectangle)rectangle).resize(10);
//        System.out.println(rectangle);
//    }
}
