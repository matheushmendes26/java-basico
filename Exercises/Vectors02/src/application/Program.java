 public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

	System.out.print("How many number you will enter: ");
        int numberQuantity = sc.nextInt();
        double[] vect = new double[numberQuantity];
        double sum =0;

        for(int i=0;i<vect.length;i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }
        System.out.print("VALORES = ");
        for(int i=0;i< vect.length;i++){
            System.out.print(String.format("%.1f  ",vect[i]));
            sum += vect[i];
  	}

        System.out.println();
        System.out.println("SUM = "+String.format("%.2f",sum));
        System.out.println("AVARAGE = "+String.format("%.2f",sum/ vect.length));


	sc.close();

	}
}