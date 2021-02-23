package bai14_exception.bai_tap.illegal_triangle_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPractice  {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a: ");
            int a = scanner.nextInt();
            System.out.print("Enter b: ");
            int b = scanner.nextInt();
            System.out.print("Enter c: ");
            int c = scanner.nextInt();
            if (a <= 0 || b<=0 || c<=0 || a+b <= c || a+c <= b || b+c <=a ){
                throw new IllegalTriangleException();
            }else System.out.println("day la 3 canh cua tam giac");
        }catch (InputMismatchException | IllegalTriangleException e) {
            System.err.println("Loi nhap sai dinh dang!");
//            e.printStackTrace();
        }
    }
}
