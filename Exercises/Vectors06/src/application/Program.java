 public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
     	
	System.out.print("How many elements contain each vector? ");
        int numberQuantity = sc.nextInt();
        double[] A = new double[numberQuantity];
        double[] B = new double[numberQuantity];
        double[] C = new double[numberQuantity];

        System.out.println("Enter with de values of the vector A:");
        for(int i=0;i<A.length;i++)
        {
            A[i] = sc.nextDouble();
        }

        System.out.println("Enter with de values of the vector B:");
        for(int i=0;i<B.length;i++)
        {
            B[i] = sc.nextDouble();
        }
        System.out.println("RESULT VECTOR: ");
        for(int i=0;i<A.length;i++)
        {
            C[i] = A[i]+B[i];
            System.out.println(C[i]);
        }

	sc.close();

	}
}