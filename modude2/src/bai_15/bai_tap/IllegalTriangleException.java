package bai_15.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception{

    @Override
    public String getMessage() {
        return "không pải 3 cạnh tam giác";
    }
}
