package bai6_Inheritance.bai_tap.circle_cylinder;

public class DemoCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"yellow");
        Cylinder cylinder = new Cylinder(10,"red",10);
        System.out.println(circle);
        System.out.println(cylinder);
    }
}
