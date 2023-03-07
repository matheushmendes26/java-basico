package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public double NetSalary(){
        return grossSalary-tax;
    }
    public void IncreaseSalary (double percentage){
        System.out.println("Update data: "+name+", $"+ ((percentage*grossSalary/100)+NetSalary()));
    }
    public String toString(){
        return "Employee: "+name+", $ "+String.format("%.2f\n",NetSalary());
    }
}
