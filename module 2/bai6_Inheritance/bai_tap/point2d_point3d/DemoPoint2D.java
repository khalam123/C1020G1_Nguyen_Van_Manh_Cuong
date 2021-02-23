package bai6_Inheritance.bai_tap.point2d_point3d;


import java.util.Arrays;

public class DemoPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point2D point2D_1 = new Point2D(3,5);
        System.out.println("point2D: "+point2D);
        System.out.println("point2D_1: "+point2D_1);

        point2D_1.setXY(10,4);
        System.out.println("point2D_1: " + point2D_1);

        System.out.println("point2D_1: "+ Arrays.toString(point2D_1.getXY()));
    }


}
