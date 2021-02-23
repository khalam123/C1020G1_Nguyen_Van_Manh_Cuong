package bai7_abstract_class.bai_tap.resizeable;

public class Main {
    public static void main(String[] args) {
        int percent = (int) (Math.random() * 100) +1;
        System.out.println(percent);
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10,10);
        Square square = new Square(5);
        System.out.println("Before-change:");
        System.out.println("Circle has area: "+circle.getArea());
        System.out.println("Rectangle has area: "+rectangle.getArea());
        System.out.println("Square has area: "+square.getArea());
        System.out.println("After-change:");
        circle.resize(percent);
        rectangle.resize(percent);
        square.resize(percent);
        System.out.println("Circle has area: "+circle.getArea());
        System.out.println("Rectangle has area: "+rectangle.getArea());
        System.out.println("Square has area: "+square.getArea()+ ", "+square.howToColor());

    }
}
