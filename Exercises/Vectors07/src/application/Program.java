 public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements contain each vector? ");
        int numberQuantity = sc.nextInt();
        double[] vector = new double[numberQuantity];
        double sum =0;
        for(int i=0;i<vector.length;i++){
            System.out.print("Enter with a number: ");
            vector[i] = sc.nextDouble();
            sum +=vector[i];
        }
        System.out.println("VECTORS AVERAGE = "+String.format("%.3f",sum/ vector.length));
        System.out.println("ELEMENTS ABOVE OF THE AVERAGE");
        for(int i=0;i<vector.length;i++){
            if(vector[i]<sum/vector.length){
                System.out.println(String.format("%.1f",vector[i]));
            }
        }

	sc.close();

	}
}