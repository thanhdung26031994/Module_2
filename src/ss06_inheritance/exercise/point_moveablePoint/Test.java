package ss06_inheritance.exercise.point_moveablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(2, 4);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
