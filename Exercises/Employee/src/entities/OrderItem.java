package entities;

public class OrderItem
{
    private Integer quantity;
    private double price;

    private Product2 product;

    public OrderItem(){

    }

    public OrderItem(Integer quantity, double price, Product2 product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product2 getProduct2() {
        return product;
    }

    public void setProduct2(Product2 product) {
        this.product = product;
    }
    public double subtotal(){
        return price*quantity;
    }

    @Override
    public String toString() {
        return getProduct2().getName()
                +", $"
                +String.format("%.2f",price)
                +", Quantity: "
                +quantity
                +", Subtotal: $"
                +String.format("%.2f",subtotal());
    }
}
