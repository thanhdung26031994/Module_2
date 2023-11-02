package case_study.models;

public class Room extends Facility{
    private String  includedServiceFree;

    public Room(String includedServiceFree) {
        this.includedServiceFree = includedServiceFree;
    }

    public Room(String code, String serviceName, Float acreage, Double costsRental, Integer maxPeople, String typeRental, String includedServiceFree) {
        super(code, serviceName, acreage, costsRental, maxPeople, typeRental);
        this.includedServiceFree = includedServiceFree;
    }

    public String getIncludedServiceFree() {
        return includedServiceFree;
    }

    public void setIncludedServiceFree(String includedServiceFree) {
        this.includedServiceFree = includedServiceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "includedServiceFree='" + includedServiceFree + '\'' +
                "} " + super.toString();
    }
}
