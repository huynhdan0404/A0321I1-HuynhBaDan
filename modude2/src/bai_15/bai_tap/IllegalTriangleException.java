package bai_15.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException{

    static void illegalTriangleException(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a){
            throw new ArithmeticException("khong phai 3 canh tam giac");
        }else {
            System.out.println("la 3 canh tam giac");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 3 canh tam giac");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        illegalTriangleException(a,b,c);
    }
}
