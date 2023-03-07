package entities;

public class ImportedProduct extends Product3{
    private double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, double customsFree) {
        super(name, price);
        this.customsFee = customsFree;
    }

    public double getCustomsFree() {
        return customsFee;
    }

    public void setCustomsFree(double customsFree) {
        this.customsFee = customsFree;
    }
    @Override
    public String priceTag(){
        return super.priceTag()+"(Custom fee: $"+String.format("%.2f",customsFee);
    }
}
