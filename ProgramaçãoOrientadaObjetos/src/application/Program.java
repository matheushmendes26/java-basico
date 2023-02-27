package application;


import java.net.Inet4Address;
import java.util.Locale;
import java.util.Scanner;

import entities.*;
import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Product  product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();
        System.out.println("Product data: "+product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: "+product);

        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: "+product);
        */

        //Exercise #1
        /*
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.println(rectangle);
         */

        //Exercise #2
        /*
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
        */

        //Exercise #3
        /*
        Student student = new Student();
        student.name = sc.nextLine();
        student.firstQuarter = sc.nextDouble();
        student.secondQuarter = sc.nextDouble();
        student.thirdQuarter = sc.nextDouble();

        student.Verify();
        */

        //Exercise #4
        /*
        System.out.print("What is dollar price? ");
        double priceDollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollars = sc.nextDouble();

        CurrencyConverter.Convert(priceDollar,dollars);
        */

        //Exercise #5
        /*
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

         */



        sc.close();
    }
}
