package entities;

public class Bill {
    private String name;
    private int number;
    private double balance;

    public Bill(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Bill(String name, int number, double initialDeposit) {
        this.name = name;
        this.number = number;
        deposit(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double depositValue) {
        balance += depositValue;
    }

    public void withdrawals(double withdrawalsValue) {
        balance = balance - withdrawalsValue - 5;
    }

    @Override
    public String toString() {
        return "Account data:\n"
                +"Account "+number
                +", Holder: "+name
                +", Balance: $ "+String.format("%.2f\n",balance);
    }
}
