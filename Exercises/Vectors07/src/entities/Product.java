package entities;

public class Product {
    public String name;
    public double price;
    public Integer quantity;

    public Product(){

    }

    public Product(String name, double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        double totalValue = price*quantity;
        return totalValue;
    }
    public void addProducts(Integer quantity){
        this.quantity += quantity;
        totalValueInStock();
    }
    public void removeProducts(Integer quantity){
        this.quantity -= quantity;
        totalValueInStock();
    }

    public String toString(){
        return name +", $ "+String.format("%.2f",price)+", "+quantity+" units, Total: $"+ String.format("%.2f",totalValueInStock());
    }
}
