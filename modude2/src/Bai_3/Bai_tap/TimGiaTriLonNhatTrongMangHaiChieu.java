package Bai_3.Bai_tap;
import java.util.Scanner;
public class TimGiaTriLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

        int x = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
               if (matrix[row][column] > x){
                   x = matrix[row][column];
               }
            }
        }
        System.out.println(x);
    }
}
