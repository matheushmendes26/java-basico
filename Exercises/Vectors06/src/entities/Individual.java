package entities;

public class Individual extends People2{
    private Double healthExpenditures;

    public Individual(){
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    @Override
    public double taxesPaid(){
        double basicTax;

        if(getAnualIncome()<20000)
        {
            basicTax = getAnualIncome()*0.15 - 0.5*healthExpenditures;
        }else{
            basicTax = getAnualIncome()*0.25 - 0.5*healthExpenditures;
        }
        if(basicTax<0.0){
            basicTax = 0;
        }
        return basicTax;
    }
}
