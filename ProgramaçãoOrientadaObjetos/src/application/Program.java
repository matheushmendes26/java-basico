package application;


import java.net.Inet4Address;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Date;

import entities.*;
import entities.enums.OrderStatus;
import entities.enums.WorkerLevel;
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


        sc.close();
    }
}
