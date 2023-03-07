 public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int numberQuantity = sc.nextInt();
        List<Employee2> list = new ArrayList<>();
        int i =0;
        while(i<numberQuantity){
            System.out.println("Employee #"+(i+1)+":");
            System.out.print("Id: ");
            sc.nextLine();
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employee2(id, name, salary));
            System.out.println();
            i++;
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee2 result = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
        if(result == null){
            System.out.println("This id does not exist!");

        }else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            for(Employee2 x: list){
                if(x.getId()==id){
                    x.increaseSalary(percentage);
                }
            }
        }
        System.out.println("List of employees:");
        for (Employee2 x: list){
            System.out.println(x);
        }

	sc.close();

	}
}