package ss05_AM_Static.Practive;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDT";
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }

    public static void main(String[] args) {
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(111, "Khanh");
        Student s3 = new Student(111, "Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
