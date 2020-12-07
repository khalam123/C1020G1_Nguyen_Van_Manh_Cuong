package bai6_Inheritance.bai_tap.point_moveablepoint;

import java.util.Arrays;

public class DemoPoint {
    public static void main(String[] args) {
        Point point = new Point();
        Point point1 = new Point(5,5);

        System.out.println("Point: "+point);
        System.out.println("Point1: "+point1);

        point1.setXY(7,7);
        System.out.println("Point1: "+point1);
        System.out.println("Point1: "+ Arrays.toString(point1.getXY()));
    }
}
