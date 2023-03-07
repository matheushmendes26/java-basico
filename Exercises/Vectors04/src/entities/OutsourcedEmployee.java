package entities;

public class OutsourcedEmployee extends Employee3{
    private double additionalCharge;

    public OutsourcedEmployee(){
        super();

    }

    public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, double additionalCharge) {
        super(name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        return super.payment() + additionalCharge*1.1;
    }

}
