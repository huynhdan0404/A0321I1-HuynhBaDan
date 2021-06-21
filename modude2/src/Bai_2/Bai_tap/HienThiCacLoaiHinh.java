package Bai_2.Bai_tap;
import java.util.Scanner;
public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập x");
        x = input.nextInt();
        System.out.println("nhập y");
        y = input.nextInt();
        for (int i = 0;i < x;i++){
            for (int j =0;j<y;j++){
                System.out.print("* ");

            }
            System.out.println("");
        }

        for (int i = 0;i<x;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = x;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
