package Bai_3.Bai_tap;
import java.util.Scanner;
public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap size mang: ");
        int x = scanner.nextInt();
        int arr[] = new int[x];
        for (int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        for (int  j = 0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

        int y = arr[0];
        for (int  j = 0;j<arr.length;j++){
           if (arr[j] < y){
               y = arr[j];
           }
        }
        System.out.println("so nho nhat la: " + y);
    }
}
