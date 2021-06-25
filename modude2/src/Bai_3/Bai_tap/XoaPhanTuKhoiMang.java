package Bai_3.Bai_tap;
import java.util.Scanner;
public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần xóa");
        int x = scanner.nextInt();
        int c,i;
        int array[] = new int[arr.length-1];
        for (c = i = 0; i < arr.length; i++) {
            if (arr[i] != x) {
                array[c] = arr[i];
                c++;
            }
        }
      for (int  j = 0;j<array.length;j++){
          System.out.println(array[j]);
      }
    }
}
