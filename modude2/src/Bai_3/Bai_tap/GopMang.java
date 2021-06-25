package Bai_3.Bai_tap;
import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[7];
        int c[] = new int[a.length + b.length];
        Scanner scanner = new Scanner(System.in);
        int x;
        for (int i = 0;i<a.length;i++){
            System.out.println("nhap phan tu so " + (i+1) + " mang a");
            x = scanner.nextInt();
            a[i] = x;
        }

        for (int j = 0;j<b.length;j++){
            System.out.println("nhap phan tu so " + (j+1) + " mang b");
            x = scanner.nextInt();
            b[j] = x;
        }

        for (int i=0;i<c.length;i++){
            if (i < a.length){
                c[i] = a[i];
            }
            c[i] = b[i];

        }

        for (int  j = 0;j<c.length;j++){
            System.out.println(c[j]);
        }

        }
}
