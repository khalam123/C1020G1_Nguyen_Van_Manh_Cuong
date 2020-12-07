package bai5_access_modifier.bai_tap;

public class AccessModifier {
    public static class Circle{
        private double radius = 1.0;

        public Circle() {
        }

        public Circle(double radius, String color) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }
        public double getArea(){
            return Math.PI*Math.pow(radius,2);
        }
    }
}
