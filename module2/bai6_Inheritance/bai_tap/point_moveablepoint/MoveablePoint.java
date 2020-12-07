package bai6_Inheritance.bai_tap.point_moveablepoint;

public class MoveablePoint extends Point {
    private float z = 0.0f;
    public MoveablePoint(){
    }

    public MoveablePoint(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{this.x,this.y,this.z};
    }
    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public String toString() {
        return "("+this.x+" , "+this.y+" , " +this.z + " )";
    }

}
