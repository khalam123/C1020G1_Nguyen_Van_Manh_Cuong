package bai6_Inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder(){
    }

    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getBottomArea(){
        return super.getArea();
    }
    public double getAroundArea(){
        return super.getPerimeter() * height;
    }
    public double getTotalArea(){
        return this.getAroundArea() + (2*this.getBottomArea());
    }
    public double getVolume(){
        return this.getBottomArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder has: color: "+ this.getColor()+", radius: " + this.getRadius() + ", Bottom Area: "
                +this.getBottomArea()+ ", Around Area: "+this.getAroundArea()+", Total Area: "+this.getTotalArea()
                +", Volume: "+this.getVolume();
    }
}
