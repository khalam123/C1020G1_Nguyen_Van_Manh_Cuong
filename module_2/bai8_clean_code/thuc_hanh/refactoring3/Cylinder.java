package bai8_clean_code.thuc_hanh.refactoring3;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI  * radius;
        return perimeter * height + 2 * baseArea;
    }
    private static double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }
    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}