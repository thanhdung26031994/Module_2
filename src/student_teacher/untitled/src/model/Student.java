package model;

import java.time.LocalDate;

public class Student {
    private Integer id;
    private String name;
    private LocalDate yearOfBirth;
    private String address;
    private Float gpa;

    public Student() {
    }

    public Student(Integer id, String name, LocalDate yearOfBirth, String address, Float gpa) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.gpa = gpa;
    }

    public Student(String name, LocalDate yearOfBirth, String address, Float gpa) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.gpa = gpa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(LocalDate yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Thông tin học sinh: " +
                "ID: " + id +
                ", Tên: '" + name + '\'' +
                ", Ngày sinh: " + yearOfBirth +
                ", Địa chỉ: '" + address + '\'' +
                ", Điểm TB: " + gpa;
    }
}
