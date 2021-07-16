package bai_7.bai_tap.interface_resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("red",true,5.0);
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();
        shapes[3] = new Rectangle("blue",true,5.0,6.0);
        for (Shape shape : shapes){
            System.out.println(shape);
            if (shape instanceof Circle){
                ((Circle)shape).resize(Math.random()* 100);
            }
            System.out.println(shape);
        }

    }
}
