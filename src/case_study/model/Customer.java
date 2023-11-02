package case_study.model;

public class Customer extends Person{
    private String guestType;
    private String address;

    public Customer(String guestType, String address) {
        this.guestType = guestType;
        this.address = address;
    }

    public Customer(String id, String name, String birthday, String idCard, String phoneNumber, String email, String guestType, String address, String gender) {
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
        return "Customer{" +
                "guestType='" + guestType + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
