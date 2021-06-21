package Bai_2.Bai_tap;

public class HienThiMotTramSoNguyenTo {
    public static void main(String[] args) {
        int x = 3;
        while (x < 100){
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
            }
        }
    }
}
