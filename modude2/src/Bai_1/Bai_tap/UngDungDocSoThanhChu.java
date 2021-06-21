package Bai_1.Bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
        final static String[] ONES = {"","one","tow","three","four","five","six","seven","einght","nine","ten","eleven","tewlve","thirteen","fourteen","fiveteen","sixteen","seventeen","eighteen","nineteen"};
        final static String[] TENS = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

    public static void readNumber(int num,String value) {
        System.out.print(num > 19 ? TENS[num/10] + " " + ONES[num%10] : ONES[num]);
        System.out.print(num > 0 ? value : "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập một số");
        int num = scanner.nextInt();
        readNumber(num/100 , " hundred and ");
        readNumber(num%100,"");
    }
}
