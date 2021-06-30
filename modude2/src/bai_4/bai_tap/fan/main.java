package bai_4.bai_tap.fan;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int speed;
        boolean on;
        double radius;
        String color;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap on");
        on = Boolean.parseBoolean(scanner.nextLine());

        if (on) {
            System.out.println("nhap speed");
            speed = scanner.nextInt();
            while (speed > 4) {
                System.out.println("nhap speed");
                speed = Integer.parseInt(scanner.nextLine());
            }
        } else speed = 0;

        System.out.println("nhap radius");
        radius = Double.parseDouble(scanner.nextLine());

        System.out.println("nhap color");
        color = scanner.nextLine();

        Fan fan = new Fan(speed, radius, color);
        fan.setSpeed(speed);
        fan.setOn(on);
        fan.setRadius(radius);
        fan.setColor(color);

        System.out.println(fan.toString());
    }
}
