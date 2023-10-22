package extra_exercises.model;

public class Student extends Person{
    private String className;
    private int scores;

    public Student(String className, int scores) {
        this.className = className;
        this.scores = scores;
    }

    public Student(String id, String name, String date, String gender, String className, int scores) {
        super(id, name, date, gender);
        this.className = className;
        this.scores = scores;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{"+ super.toString() +
                "className='" + className + '\'' +
                ", scores=" + scores +
                "} " ;
    }
}
