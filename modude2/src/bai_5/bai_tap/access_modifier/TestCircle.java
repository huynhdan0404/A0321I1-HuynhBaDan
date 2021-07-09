package bai_5.bai_tap.access_modifier;
import java.util.Scanner;
public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap r");
        double radius = scanner.nextDouble();
        Circle circle = new Circle();
        System.out.println("radius = "  + circle.getRadius()
                + "\n area = " + circle.getArea(radius));
    }
}
