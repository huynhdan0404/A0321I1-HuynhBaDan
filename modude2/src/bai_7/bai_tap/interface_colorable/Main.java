package bai_7.bai_tap.interface_colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle();
        shapes[1] = new Rectangle(5.0,10.0,"blue",true);
        shapes[2] = new Circle("red",true,5.0);
        shapes[3] = new Rectangle();

        for (Shape shape:shapes){
            System.out.println(shape.Area());
            if (shape instanceof Rectangle){
                ((Rectangle)shape).howToColor();
            }
        }
    }
}
