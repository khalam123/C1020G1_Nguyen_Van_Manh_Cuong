package bai4_lop_va_doi_tuong_trong_java.bai_tap.phuongtrinhbac2;

public class QuadraticEquation {
    double num1,num2,num3,delta,x1,x2;
    //khai bao constructor
    public QuadraticEquation(double num1,double num2,double num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getNum3() {
        return num3;
    }
    public double getDiscriminant(){
        return (this.delta = this.num2 * this.num2 - 4 * this.num1 * this.num3);
    }
    public double getRoot1(){
        return this.x1 = (-this.num2 + Math.sqrt(this.delta)) / 2;
    }
    public double getRoot2(){
        return this.x2 = (this.num2 + Math.sqrt(this.delta)) / 2;
    }
}
