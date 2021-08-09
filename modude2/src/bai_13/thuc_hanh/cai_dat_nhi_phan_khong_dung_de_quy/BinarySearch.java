package bai_13.thuc_hanh.cai_dat_nhi_phan_khong_dung_de_quy;

public class BinarySearch {
    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    static int binarySearch(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key == array[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(9,array));
    }

}
