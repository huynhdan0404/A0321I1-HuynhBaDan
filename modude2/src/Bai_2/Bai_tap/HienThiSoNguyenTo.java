package Bai_2.Bai_tap;
public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int number = 0;
        int x = 3;
        while (number < 20){
            boolean check = true;
          for (int i = 2;i < x;i++){
              if (x % i == 0) {
                  check = false;
                  x++;
              }
          }
          if (check){
              System.out.println(x);
              x++;
              number++;
          }
        }
    }
}
