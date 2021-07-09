package bai_5.thuc_hanh.access_modifier.pack;

import bai_5.thuc_hanh.access_modifier.mypack.A;

public class B extends A{
    public static void main(String args[]) {

//        A obj = new A();//Compile Time Error

//        obj.mssg();//Compile Time Error

            B obj = new B();

            obj.msssg();

        }
}