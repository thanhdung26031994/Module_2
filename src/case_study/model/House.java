package case_study.model;

public class House extends Facility{
    private String standardsRoom;

    private Integer floorsOfNumber;

    public House(String standardsRoom, Integer floorsOfNumber) {
        this.standardsRoom = standardsRoom;
        this.floorsOfNumber = floorsOfNumber;
    }

    public House(String code, String serviceName, Float acreage, Double costsRental, Integer maxPeople, String typeRental, String standardsRoom, Integer floorsOfNumber) {
        super(code, serviceName, acreage, costsRental, maxPeople, typeRental);
        this.standardsRoom = standardsRoom;
        this.floorsOfNumber = floorsOfNumber;
    }

    public String getStandardsRoom() {
        return standardsRoom;
    }

    public void setStandardsRoom(String standardsRoom) {
        this.standardsRoom = standardsRoom;
    }

    public Integer getFloorsOfNumber() {
        return floorsOfNumber;
    }

    public void setFloorsOfNumber(Integer floorsOfNumber) {
        this.floorsOfNumber = floorsOfNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardsRoom='" + standardsRoom + '\'' +
                ", floorsOfNumber=" + floorsOfNumber +
                "} " + super.toString();
    }
}
