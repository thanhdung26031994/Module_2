package ss05_am_static.exercise.student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Dung");
        student.setClasses("C03");
        System.out.println(student.toString());
    }
}
