package bai7_abstract_class.thuc_hanh.comparator;

import bai6_Inheritance.bai_tap.circle_cylinder.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1,Circle c2){
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
