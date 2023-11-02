package case_study.models;

public class Customer extends Person{
    private String guestType;
    private String address;

    public Customer(String name, String birthday, String idCard, String phone, String email,String gender, String guestType, String address) {
        super(name, birthday, idCard, phone, email, gender);
        this.guestType = guestType;
        this.address = address;
    }

    public Customer(String id, String name, String birthday, String idCard, String phoneNumber, String email, String gender, String guestType, String address) {
        super(id, name, birthday, idCard, phoneNumber, email, gender);
        this.guestType = guestType;
        this.address = address;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Thông tin KH: " + super.toString() +
                ", Loại khách: " + guestType +
                ", Địa chỉ: " + address;
    }
}
