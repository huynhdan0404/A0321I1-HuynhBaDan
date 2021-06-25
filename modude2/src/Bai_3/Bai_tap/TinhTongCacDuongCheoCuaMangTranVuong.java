package Bai_3.Bai_tap;
import java.util.Scanner;
public class TinhTongCacDuongCheoCuaMangTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int arr[][] = new int[x][x];
        for (int i = 0;i <arr.length;i++){
            for (int j = 0;j< arr[i].length;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0;i <arr.length;i++){
            for (int j = 0;j< arr[i].length;j++){
               if (j == i || j == arr[i].length - (i+1)){
                   sum+=arr[i][j];
               }
            }
        }
        System.out.println("sum: " + sum);
    }
}
