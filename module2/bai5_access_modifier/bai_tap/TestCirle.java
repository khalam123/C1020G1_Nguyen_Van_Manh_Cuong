package bai5_access_modifier.bai_tap;

public class TestCirle {
    public static void main(String[] args) {
        AccessModifier.Circle circle = new AccessModifier.Circle(5,"yellow");
        System.out.println("Radius: "+ circle.getRadius());
        System.out.println("Area: "+ circle.getArea());

    }
}
