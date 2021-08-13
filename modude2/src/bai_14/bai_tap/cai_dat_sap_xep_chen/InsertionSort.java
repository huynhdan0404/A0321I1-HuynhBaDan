package bai_14.bai_tap.cai_dat_sap_xep_chen;

import java.util.Scanner;

public class InsertionSort {
    public static void  insertionSort(int[] list){
        for (int i = 1;i < list.length;i++  ){
            int last = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > last){
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j+1] = last;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap size array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("nhap cac phan tu");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("truoc khi sapxep");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        insertionSort(arr);
        System.out.println("sau sap xep");
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
