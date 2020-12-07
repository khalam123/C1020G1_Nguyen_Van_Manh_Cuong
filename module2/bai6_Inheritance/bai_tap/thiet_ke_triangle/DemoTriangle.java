package bai6_Inheritance.bai_tap.thiet_ke_triangle;

public class DemoTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Triangle triangle1 = new Triangle("yellow",true,3,4,5);

        System.out.println(triangle);
        System.out.println(triangle1);

        triangle1.setSide1(7);
        triangle1.setSide2(5);
        triangle1.setSide3(3);
        System.out.println(triangle1);
    }
}
