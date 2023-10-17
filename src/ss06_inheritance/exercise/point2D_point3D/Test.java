package ss06_inheritance.exercise.point2D_point3D;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(3, 8);
        System.out.println(point2D);
        Point3D point3D = new Point3D(4,5,6);
        System.out.println(point3D);
    }
}
