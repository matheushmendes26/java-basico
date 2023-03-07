 public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

	System.out.print("How many numbers you will enter? ");
        int numberQuantity = sc.nextInt();
        double[] vect = new double[numberQuantity];

        for(int i=0;i<vect.length;i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }
        double maior = vect[0];
        int position = 0;
        for(int i=0;i< vect.length;i++){
            if(vect[i]>=maior)
            {
                position = i;
                maior = vect[i];
            }
        }
        System.out.println("HIGHER VALUE = "+String.format("%.1f",vect[position]));
        System.out.println("POSITION OF THE HIGHER VALUE = "+position);
	sc.close();

	}
}