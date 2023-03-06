package application;


import java.net.Inet4Address;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;


import entities.*;
import entities.enums.OrderStatus;
import entities.enums.WorkerLevel;
import exceptions.DomainException;
import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Enumeration Example
        /*
        Order order = new Order(01, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);


         */
        //Composition Exercise
        /*
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
        Department department1 = new Department(department);
        Worker worker = new Worker(name,WorkerLevel.valueOf(level),baseSalary,department1);

        System.out.print("How many contracts have this worker? ");
        int numberOfContracts = sc.nextInt();
        for(int i=0;i<numberOfContracts;i++)
        {
            System.out.print("Enter contract #"+(i+1)+" data: ");
            System.out.print("Date (DD/MM/YYYY)= ");
            Date date = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration in hours: ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(date,valuePerHour,hours);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter with de month and year to calculate the income: ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println(worker.getName());
        System.out.println(worker.getDepartment().getName());
        System.out.println(worker.income(year,month));

         */

        //Composition Exercise 2#
        /*
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(sdf.parse("21/05/2018 13:05:44"),"Traveling to New Zeeland","I'm gonna visit it!!",12);
        p1.addComment(c1);
        p1.addComment(c2);
        System.out.println(p1);


         */

        //Composition Challenge
        /*
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order2 order = new Order2(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            Product2 product = new Product2(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItems(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

         */

        // Inheritance Exercise
        /*
        List<Employee3> employees = new ArrayList<>();
        System.out.print("Enter the number of employess: ");
        int number = sc.nextInt();
        for(int i=0;i<number;i++)
        {
            System.out.println("Employee #"+(i+1)+" data:");
            System.out.print("Outsourced(y/n)? ");
            char x = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hour = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(x =='n'){
                employees.add(new Employee3(name,hour,valuePerHour));
            }else
            {
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name,hour,valuePerHour,additionalCharge));
            }

        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for(Employee3 e: employees)
        {
            System.out.print(e);
        }
         */

        // Inheritance Exercise #2
        /*
        List<Product3> products = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int number = sc.nextInt();
        for(int i=0;i<number;i++){
            System.out.println("Product #"+(i+1)+" data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char x = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(x =='c'){
                products.add(new Product3(name,price));
            }else if( x == 'i'){
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();
                products.add(new ImportedProduct(name,price,customFee));
            }else if(x == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(name,price,date));
            }

        }
        System.out.println();
        System.out.print("PRICE TAGS:");
        for(Product3 p: products){
            System.out.println(p.priceTag());;
        }

         */

        // Inheritance Exercise #3
        /*
        List<People2> payers = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int taxPayers = sc.nextInt();
        for(int i=1;i<=taxPayers;i++)
        {
            System.out.println("Tax pay #"+i+" data:");
            System.out.print("Individual or company (i/c)? ");
            char x = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if(x=='i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                payers.add(new Individual(name,annualIncome,healthExpenditures));
            }else if(x=='c'){
                System.out.print("Number of Employees: ");
                int numberOfEmployees = sc.nextInt();
                payers.add(new Company(name,annualIncome,numberOfEmployees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0;
        for(People2 p: payers)
        {
            sum += p.taxesPaid();
            System.out.println(p.getName()+": $ "+String.format("%.2f",p.taxesPaid()));
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ "+String.format("%.2f",sum));

         */
        //Exceptions Exercise
        /*
        File file = new File("C:\\tmp\\in.txt");
        Scanner scanner  = null;
        try{
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error opening file: "+ e.getMessage());

        }finally {
            if(scanner != null){
                scanner.close();
            }
        }

         */

        //Exception Exercise
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withDrawLimit = sc.nextDouble();
            Account acc1 = new Account(number, holder, initialBalance, withDrawLimit);
            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            acc1.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", acc1.getBalance()));
            }
        catch (DomainException e){
            System.out.println("Withdraw error: "+e.getMessage());
        }


        sc.close();
    }
}
