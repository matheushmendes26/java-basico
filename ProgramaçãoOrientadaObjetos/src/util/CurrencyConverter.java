package util;

public class CurrencyConverter {

    public static void Convert(double priceDollar,double dollarQuantity){
        System.out.println("Amount to be paid in reais = "+String.format("%.2f\n",priceDollar*dollarQuantity*1.06));
    }
}
