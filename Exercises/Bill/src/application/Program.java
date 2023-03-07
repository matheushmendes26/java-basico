 public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

	Bill bill;
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char isDeposit = sc.next().charAt(0);
        if(isDeposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bill = new Bill(name,accountNumber,initialDeposit);

        }else{
            bill = new Bill(name,accountNumber);
        }
        System.out.println();
        System.out.println(bill);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        bill.deposit(deposit);
        System.out.println("Update account data: ");
        System.out.println();
        System.out.println(bill);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bill.withdrawals(withdraw);
        System.out.println("Update account data: ");
        System.out.println();
        System.out.println(bill);

	sc.close();

	}
}