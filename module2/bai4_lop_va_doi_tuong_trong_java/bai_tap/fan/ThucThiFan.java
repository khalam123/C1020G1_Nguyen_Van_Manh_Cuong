package bai4_lop_va_doi_tuong_trong_java.bai_tap.fan;

public class ThucThiFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(10);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(5);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("Fan 1 status: " + fan1.toString());
        System.out.println("Fan 2 status: " + fan2.toString());
    }
}
