package bai4_lop_va_doi_tuong_trong_java.bai_tap.phuongtrinhbac2;

import java.util.Scanner;

public class GiaiPTB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soA, soB, soC, delta, x1, x2;
        System.out.println("Phương trình bậc 2 có dạng: a(x^2)+ bx + c = 0");
        System.out.print("Nhập số a: ");
        soA = scanner.nextDouble();
        System.out.print("Nhập số b: ");
        soB = scanner.nextDouble();
        System.out.print("Nhập số c: ");
        soC = scanner.nextDouble();
        System.out.printf("Phương trình bậc 2 có dạng: %s(x^2) + (%s)x + (%s) = 0%n",soA,soB,soC);
        if(soA == 0) {
            if(soB == 0) {
                if(soC == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else System.out.println("Phương trình vô nghiệm");
            } else{
                double root = -soC/soB;
                System.out.printf("Phương trình có 1 nghiệm là x = %s%n", root);
            }
        }else{
            QuadraticEquation quadraticEquation = new QuadraticEquation(soA,soB,soC);
            delta = quadraticEquation.getDiscriminant();
            if(delta<0)
                System.out.println("Phương trình vô nghiệm");
            else if(delta == 0) {
                x1 = quadraticEquation.getRoot1();
                System.out.println("Phương trình có nghiệm kép x = " + x1);
            }else{
                x1 = quadraticEquation.getRoot1();
                x2 = quadraticEquation.getRoot2();
                System.out.println("Nghiệm 1 là x1 = " + x1);
                System.out.println("Nghiệm 2 là x2 = " + x2);
            }

        }
    }
}
