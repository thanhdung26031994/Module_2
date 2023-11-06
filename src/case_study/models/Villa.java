package case_study.models;

public class Villa extends Facility{
    private String standardsRoom;

    private Integer floorsOfNumber;
    private Float areaPoolSwimming;

    public Villa(){}

    public Villa(String standardsRoom, Integer floorsOfNumber, Float areaPoolSwimming) {
        this.standardsRoom = standardsRoom;
        this.areaPoolSwimming = areaPoolSwimming;
        this.floorsOfNumber = floorsOfNumber;
    }

    public Villa(String code, String serviceName, Float acreage, Double costsRental, Integer maxPeople, String typeRental, String standardsRoom, Integer floorsOfNumber, Float areaPoolSwimming) {
        super(code, serviceName, acreage, costsRental, maxPeople, typeRental);
        this.standardsRoom = standardsRoom;
        this.floorsOfNumber = floorsOfNumber;
        this.areaPoolSwimming = areaPoolSwimming;

    }

    public String getStandardsRoom() {
        return standardsRoom;
    }

    public void setStandardsRoom(String standardsRoom) {
        this.standardsRoom = standardsRoom;
    }

    public Float getAreaPoolSwimming() {
        return areaPoolSwimming;
    }

    public void setAreaPoolSwimming(Float areaPoolSwimming) {
        this.areaPoolSwimming = areaPoolSwimming;
    }

    public Integer getFloorsOfNumber() {
        return floorsOfNumber;
    }

    public void setFloorsOfNumber(Integer floorsOfNumber) {
        this.floorsOfNumber = floorsOfNumber;
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() +
                ", Tiêu chuẩn phòng: " + standardsRoom +
                ", Diện tích hồ bơi: " + areaPoolSwimming +
                ", Số tầng: " + floorsOfNumber;
    }
}
