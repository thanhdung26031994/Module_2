package ss17_oi_binary_serialization.exercise.model;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer id;
    private String name;
    private Double price;
    private String manufactured;
    private String describe;

    public Product(String name, Double price, String manufactured, String describe) {
        this.name = name;
        this.price = price;
        this.manufactured = manufactured;
        this.describe = describe;
    }

    public Product(Integer id, String name, Double price, String manufactured, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufactured = manufactured;
        this.describe = describe;
    }

    public Integer getId(int id) {
        return this.id;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufactured='" + manufactured + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
