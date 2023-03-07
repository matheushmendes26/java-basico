 public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


	System.out.print("What is dollar price? ");
        double priceDollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollars = sc.nextDouble();

        CurrencyConverter.Convert(priceDollar,dollars);

	sc.close();

	}
}