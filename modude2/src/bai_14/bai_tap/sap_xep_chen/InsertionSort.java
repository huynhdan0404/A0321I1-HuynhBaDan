package bai_14.bai_tap.sap_xep_chen;

import java.util.Scanner;

public class InsertionSort {
    static void sort(int arr[]) {
       for (int i = 1;i < arr.length;i++){
           int last = arr[i];
           int j = i - 1;
           while (j >= 0 && arr[j] > last){
               System.out.println("swap" + last + "vs" + arr[j]);
               arr[j + 1] = arr[j];
               j = j - 1;
               for (int element : arr) {
                   System.out.println(element);
               }
           }
           arr[j + 1] = last;
       }
        System.out.println("sau khi sap xep xong");
        for (int element : arr) {
            System.out.println(element);
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

        sort(arr);
    }
}
