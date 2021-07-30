package bai_11.bai_tap.dao_nguoc_phan_tu_trong_mang_su_dung_stack;

import java.util.Stack;

public class DaoNguocMang {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        for (Integer element : stack) {
            System.out.println(element);
        }
        for (int i = 0; i < stack.size(); i++) {
            stack.add(i, stack.pop());
        }

        for (Integer element : stack) {
            System.out.println(element);
        }
    }
}
