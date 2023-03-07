 public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

	System.out.print("How many number you will enter: ");
        int numberQuantity = sc.nextInt();
        int[] vect = new int[numberQuantity];

        for(int i=0;i<vect.length;i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Negative numbers: ");
        for(int i=0;i< vect.length;i++){
            if(vect[i]<0){
                System.out.println(vect[i]);
            }
        }

	sc.close();

	}
}