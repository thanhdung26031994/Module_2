package ss05_AM_Static.Exercise.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Dung");
        student.setClasses("C03");
        System.out.println(student.getClasses());
        System.out.println(student.getName());
    }
}
