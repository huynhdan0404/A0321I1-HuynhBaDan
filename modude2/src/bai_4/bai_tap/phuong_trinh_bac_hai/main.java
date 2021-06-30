package bai_4.bai_tap.phuong_trinh_bac_hai;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a ");
        a = scanner.nextDouble();
        System.out.println("nhap b ");
        b = scanner.nextDouble();
        System.out.println("nhap c ");
        c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(b,a,c);

        System.out.println("delta = " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("x = " + quadraticEquation.getRoot0());
        }else if (quadraticEquation.getDiscriminant() > 0){
            System.out.println("x1 = " + quadraticEquation.getRoot1() + " x2 = " + quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant() < 0){
            System.out.println("phuong trinh vo nghiem");
        }
    }
}
