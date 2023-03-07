 public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

  	Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.print("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);

	sc.close();

	}
}