package case_study.models;

public class Villa extends Facility{
    private String standardsRoom;

    private Integer floorsOfNumber;
    private Float areaPoolSwimming;

    public Villa(){}

    public Villa(String standardsRoom, Float areaPoolSwimming, Integer floorsOfNumber) {
        this.standardsRoom = standardsRoom;
        this.areaPoolSwimming = areaPoolSwimming;
        this.floorsOfNumber = floorsOfNumber;
    }

    public Villa(String code, String serviceName, Float acreage, Double costsRental, Integer maxPeople, String typeRental, String standardsRoom, Float areaPoolSwimming, Integer floorsOfNumber) {
        super(code, serviceName, acreage, costsRental, maxPeople, typeRental);
        this.standardsRoom = standardsRoom;
        this.areaPoolSwimming = areaPoolSwimming;
        this.floorsOfNumber = floorsOfNumber;
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
        return "Villa{" +
                "standardsRoom='" + standardsRoom + '\'' +
                ", areaPoolSwimming=" + areaPoolSwimming +
                ", floorsOfNumber=" + floorsOfNumber +
                "} " + super.toString();
    }
}
