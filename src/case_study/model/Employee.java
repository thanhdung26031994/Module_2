package case_study.model;

public class Employee extends Person{
    private String position;
    private Double salary;
    private String level;


    public Employee(String position, Double salary, String level) {
        this.position = position;
        this.salary = salary;
        this.level = level;
    }

    public Employee(String id, String name, String birthday, String idCard, String phoneNumber, String email, String gender, String position, String level, Double salary) {
        super(id, name, birthday, idCard, phoneNumber, email, gender);
        this.position = position;
        this.salary = salary;
        this.level = level;
    }

    public Employee(String name, String birthday, String idCard, String phoneNumber, String email, String gender, String position, String level, Double salary) {
        super(name, birthday, idCard, phoneNumber, email, gender);
        this.position = position;
        this.salary = salary;
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Nhân Viên: " + super.toString() +
                ",Trình độ: " + level +
                ",Vị trí: " + position +
                ",Lương: " + salary;
    }
}
