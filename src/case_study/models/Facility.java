package case_study.models;

public class Facility {
    private String code;
    private String serviceName;
    private Float acreage;
    private Double costsRental;
    private Integer maxPeople;
    private String typeRental;

    public Facility(){

    }
    public Facility(String code, String serviceName, Float acreage, Double costsRental, Integer maxPeople, String typeRental) {
        this.code = code;
        this.serviceName = serviceName;
        this.acreage = acreage;
        this.costsRental = costsRental;
        this.maxPeople = maxPeople;
        this.typeRental = typeRental;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Float getAcreage() {
        return acreage;
    }

    public void setAcreage(Float acreage) {
        this.acreage = acreage;
    }

    public Double getCostsRental() {
        return costsRental;
    }

    public void setCostsRental(Double costsRental) {
        this.costsRental = costsRental;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRental() {
        return typeRental;
    }

    public void setTypeRental(String typeRental) {
        this.typeRental = typeRental;
    }

    @Override
    public String toString() {
        return "Mã dịch vụ: " + code +
                ", Tên dịch vụ: " + serviceName +
                ", Diện tích sử dụng: " + acreage +
                ", Chi phí thuê: " + costsRental +
                ", Số lượng người tối đa: " + maxPeople +
                ", Kiểu thuê: " + typeRental;
    }
}
