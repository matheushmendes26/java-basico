package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        double totalValue = price*quantity;
        return totalValue;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
        totalValueInStock();
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
        totalValueInStock();
    }

    public String toString(){
        return name +", $ "+String.format("%.2f",price)+", "+quantity+" units, Total: $"+ String.format("%.2f",totalValueInStock());
    }
}
