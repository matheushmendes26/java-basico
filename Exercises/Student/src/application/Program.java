 public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.name = sc.nextLine();
        student.firstQuarter = sc.nextDouble();
        student.secondQuarter = sc.nextDouble();
        student.thirdQuarter = sc.nextDouble();

        student.Verify();

	sc.close();

	}
}