package extra_exercises1.model;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    private String id;
    private String name;
    private LocalDate date;
    private Boolean gender = true;
    private String classRoom;
    private Double point;

    public Student() {

    }

    public Student(String id, String name, LocalDate date, Boolean gender, String classRoom, Double point) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.classRoom = classRoom;
        this.point = point;
    }

    public Student(String name, LocalDate date, Boolean gender, String classRoom, Double point) {
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.classRoom = classRoom;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Thông tin học sinh: " +
                "Mã HS: " + id +
                ", Tên: " + name +
                ", Ngày sinh: " + date +
                ", Giới tính: " + gender +
                ", Lớp: " + classRoom +
                ", Điểm số: " + point;
    }
}
