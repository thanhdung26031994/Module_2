package case_study.model;

public abstract class Person {
    private String id;
    private String name;
    private String birthday;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String gender;

    public Person() {
    }

    public Person( String name, String birthday, String idCard, String phoneNumber, String email, String gender) {
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
    }

    public Person(String id, String name, String birthday, String idCard, String phoneNumber, String email, String gender) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Mã NV:" + id  +
                ", Tên NV: " + name +
                ", Ngày sinh: " + birthday +
                ", Số CMND: " + idCard +
                ", Số điện thoại: " + phoneNumber +
                ", Email: " + email +
                ", Giới tính: " + gender;
    }
}
