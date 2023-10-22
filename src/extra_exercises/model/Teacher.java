package extra_exercises.model;

public class Teacher extends Person{
    private String specialize;

    public Teacher(String specialize) {
        this.specialize = specialize;
    }

    public Teacher(String id, String name, String date, String gender, String specialize) {
        super(id, name, date, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString()+
                "specialize='" + specialize + '\'' +
                "} " ;
    }
}
