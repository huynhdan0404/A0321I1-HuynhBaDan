package Bai_1.Bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền cần chuyển đổi");
        USD = scanner.nextDouble();
        double quydoi = USD * VND;
        System.out.println("số tiền: " + quydoi);
    }
}
