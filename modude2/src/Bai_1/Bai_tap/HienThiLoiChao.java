package Bai_1.Bai_tap;

import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.objects.XStringForChars;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập tên của bạn");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
