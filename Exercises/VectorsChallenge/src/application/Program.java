 public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many tenants will host in the hostel? ");
        int numberQuantity = sc.nextInt();
        Tenant[] vector = new Tenant[10];
        for(int i=0;i<numberQuantity;i++){
            System.out.println("Rent #"+(i+1));
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vector[room] = new Tenant(name,email);
            System.out.println();
        }

        System.out.println("Busy rooms:");
        for(int i=0;i< vector.length;i++)
        {
            if(vector[i]!=null){
                System.out.println(i+": "+vector[i]);
            }
        }

	sc.close();

	}
}