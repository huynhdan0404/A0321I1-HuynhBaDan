package bai_4.bai_tap.phuong_trinh_bac_hai;

public class QuadraticEquation {
    double a,b,c;


    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return (this.b * 2) - (4 * this.a * this.c);
    }

    public double getRoot0(){
        return (-this.b) / (2 * this.a);
    }

    public double getRoot1(){
        return (- this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
    }

    public double getRoot2(){
        return(- this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
    }

}
