package entities;

public class Employee3 {
    private String name;
    private Integer hour;
    private Double valuePerHour;

    public Employee3(){

    }

    public Employee3(String name, Integer hour, Double valuePerHour) {
        this.name = name;
        this.hour = hour;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        return valuePerHour*hour;
    }

    @Override
    public String toString() {
        return name+" - $ "+String.format("%.2f\n",payment());
    }
}
