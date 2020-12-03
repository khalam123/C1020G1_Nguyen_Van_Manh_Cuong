package bai4_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class Ex14_1 {
        public static void main(String[] args) {
            //code below here
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the width:");
            double width = scanner.nextDouble();
            System.out.print("Enter the height:");
            double height = scanner.nextDouble();
            LopHinhChuNhat.Rectangle rectangle = new LopHinhChuNhat.Rectangle(width, height);
            System.out.println("Your Rectangle \n"+ rectangle.display());
            System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
            System.out.println("Area of the Rectangle: "+ rectangle.getArea());
        }


}
