package ss06_inheritance.exercise.point_moveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(){}
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return super.toString()
                + ", speed= (xs:"
                + this.xSpeed
                + ",ys: "
                + this.ySpeed
                + ")\"";
    }
    MoveablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
