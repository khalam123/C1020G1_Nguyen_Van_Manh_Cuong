package bai6_Inheritance.bai_tap.point2d_point3d;

import java.util.Arrays;

public class DemoPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        Point3D point3D_1 = new Point3D(3,5,6);
        System.out.println("point3D: "+point3D);
        System.out.println("point3D_1: "+point3D_1);

        point3D_1.setXYZ(10,4,8);
        System.out.println("point3D_1: " + point3D_1);
        System.out.println();
        System.out.println("point3D_1: "+ Arrays.toString(point3D_1.getXYZ()));
    }

}
