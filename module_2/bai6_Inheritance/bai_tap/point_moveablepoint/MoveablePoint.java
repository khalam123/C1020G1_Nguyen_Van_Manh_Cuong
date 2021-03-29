package bai6_Inheritance.bai_tap.point_moveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MoveablePoint(){
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(float xSpeed,float ySpeed){
        return new float[]{this.xSpeed,this.ySpeed};
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint move(){
//        MoveablePoint moveablePoint = new MoveablePoint();
        this.x += xSpeed;
        this.y += ySpeed;
        return this;
    }


    @Override
    public String toString() {
        return "("+this.x+" , "+this.y+")"+" , " +"speed = (" +this.xSpeed+" , "+this.ySpeed+ " )";
    }

}
