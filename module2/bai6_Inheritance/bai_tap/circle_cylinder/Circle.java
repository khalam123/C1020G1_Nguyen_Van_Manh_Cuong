package bai6_Inheritance.bai_tap.circle_cylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";

    public Circle() {
    }
    public Circle(double raidus, String color){
        this.radius = raidus;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double raidus) {
        this.radius = raidus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }
    public double getPerimeter(){
        return 2*Math.PI* radius;
    }

    @Override
    public String toString() {
        return "Circle has: color: "+ this.color + ", radius: " + this.radius +", Area: "+ this.getArea() +
                ", Perimeter: " + this.getPerimeter();
    }
}
