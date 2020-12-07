package bai6_Inheritance.bai_tap.point_moveablepoint;

import bai6_Inheritance.bai_tap.point2d_point3d.Point3D;

import java.util.Arrays;

public class DemoMoveablePoint {
    public static void main(String[] args) {
            MoveablePoint moveablePoint = new MoveablePoint();
            MoveablePoint moveablePoint1 = new MoveablePoint(3,5,8);

            System.out.println("moveablePoint: "+moveablePoint);
            System.out.println("moveablePoint1: "+moveablePoint1);

            moveablePoint1.setXYZ(10,10,10);
            System.out.println("moveablePoint1: " + moveablePoint1);
            System.out.println();
            System.out.println("moveablePoint1: "+ Arrays.toString(moveablePoint1.getXYZ()));

    }
}
