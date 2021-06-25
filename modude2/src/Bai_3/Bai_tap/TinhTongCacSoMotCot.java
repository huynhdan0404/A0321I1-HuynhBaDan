package Bai_3.Bai_tap;
import java.util.Scanner;
public class TinhTongCacSoMotCot {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i <arr.length;i++){
            for (int j = 0;j< arr[i].length;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("nhập cột cần tính tổng");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0;i <arr.length;i++){
            for (int j = 0;j< arr[i].length;j++){
               if (j == x){
                   sum+= arr[i][j];
               }
            }
        }
        System.out.println("tổng là: " + sum);
    }
}
