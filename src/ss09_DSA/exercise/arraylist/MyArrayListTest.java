package ss09_DSA.exercise.arraylist;

public class MyArrayListTest {
    public static class Student{
        private int id;
        private String name;

        public Student(){}

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Dung");
        Student student2 = new Student(2, "Hai");
        Student student3 = new Student(3, "Quang");
        Student student4 = new Student(4, "Lam");
        Student student5 = new Student(5, "Thien");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5);

        System.out.println(studentMyArrayList.size());
        System.out.println(studentMyArrayList.get(2).getName());
        System.out.println(studentMyArrayList.indexOf(student2));

        newMyArrayList = studentMyArrayList.clone();
        newMyArrayList.remove(1);
        for (int i = 0; i < newMyArrayList.size(); i++){
            System.out.println(newMyArrayList.get(i).getName());
        }

    }

}
